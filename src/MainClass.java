import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.data.Table;
import processing.data.TableRow;

import javax.swing.*;

public class MainClass extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainClass", args);
        JFrame frameInterp = new Interpreter();
        frameInterp.setVisible(true);

    }

    public static int x;    // movement of car based on input code
    public static int funcNr = 0;

    int sizeOfMap;  // how many rows there are in a map
    int[][] map1; // one map consists of 10 layers. array will be drawn from bottom to top
    int[][] map2;
    int[][] map3;
    int currentMap = 0;
    Table mapTable;
    String[] header = {"a", "b", "c"};
    int layer;
    int startX;  // x coordinate where map starts to be drawn
    int startY;
    int block;  // rectangle that represents obstacle

    Boolean pause  = false;

    PFont f;

    boolean mapPressed;  // is 'E' key pressed

    PImage backgr1;
    PImage backgr2;
    int counter;

    int score;

    int mapProgress;

    PImage carMap;
    PImage car;
    int posX, posY;
    int carW, carH;
    int imgW, imgH, collumn, row;
    int distanceFromTop;
    int distanceFromLeft;
    int speed;
    int carPosX, carPosY;
    int XOnScreen;
    int direction;
    int[] DirectionX = {0, 1, -1};

    PImage ob; // obstacle
    int obsX, obsY;  // used for drawing
    int realObsX, realObsY; // actual position on screen

    public void settings() {
        size(1536, 820);
    }

    public void setup() {
        //size(1536, 820);  // window size

        sizeOfMap = 10;
        layer = 0;
        block = 40;
        startX = 1536 - block*3;
        startY = 50;

        //10 rows * 3 maps + 2 bloks of 3*3 whitespace between maps
        map1 = new int[10][3];
        map2 = new int[10][3];
        map3 = new int[10][3];

        mapTable = loadTable("map1.csv", "header");
        int i = 0;
        for (TableRow row : mapTable.rows()) {
            for (int j = 0; j < 3; j++) {
                map1[i][j] = row.getInt(header[j]);
            }
            i++;
        }
        i = 0;
        mapTable = loadTable("map2.csv", "header");
        for (TableRow row : mapTable.rows()) {
            for (int j = 0; j < 3; j++) {
                map2[i][j] = row.getInt(header[j]);
            }
            i++;
        }
        i = 0;
        mapTable = loadTable("map3.csv", "header");
        for (TableRow row : mapTable.rows()) {
            for (int j = 0; j < 3; j++) {
                map3[i][j] = row.getInt(header[j]);
            }
            i++;
        }


        f = createFont("Arial", 16, true);

        backgr1 = loadImage("b1.png");
        backgr2 = loadImage("b2.png");

        carMap  = loadImage("car.png");
        imgW = carMap.width;
        imgH = carMap.height;

        mapPressed = false;

        //sets collumn and row widths. car.png has 6 collumns and 4 rows
        collumn = imgW/6;
        row = imgH/4;

        carPosX = 8;
        carPosY = 640;

        score = 0;

        direction = 0; // the car will not go to right or left without input

        // rezolution of one car image in car.png
        carW = 96;
        carH = 64;

        //Enter what car image you want to use
        posX = 0;
        posY = 0;

        speed = 15;

        ob = loadImage("ob.png");
        realObsY = -300;

        mapProgress = 0;

        counter = 0; // background animation counter

        frameRate(2); //30
    }

    public void drawFor(int n, int x){
        if(this.x < n*x){
            this.x += x;
        }
        else{
            this.x = 0;
            funcNr = 0;
            direction = 0;
        }
    }
    public void drawWhile(int x){
        this.x = x;
    }
    public void drawIfLess(int n, int x){
        if(this.x < n){
            this.x = x;
        }
    }
    public void drawIfMore(int n, int x){
        if(this.x > n){
            this.x = x;
        }
    }
    public void drawIfLessElse(int n, int x, int y){
        if(this.x < n){
            this.x = x;
        }
        else{
            this.x = y;
        }
    }
    public void drawIfMoreElse(int n, int x, int y){
        if(this.x > n){
            this.x = x;
        }
        else{
            this.x = y;
        }
    }

    public void draw() {
        if(funcNr != 0){
            int nr = funcNr;
            switch(nr){
                case 1:
                    drawFor(Listener.n, Listener.newVal);
                    break;
                case 2:
                    drawWhile(Listener.newVal);
                    break;
                case 3:
                    drawIfLess(Listener.n, Listener.newVal);
                    break;
                case 4:
                    drawIfMore(Listener.n, Listener.newVal);
                    break;
                case 5:
                    drawIfLessElse(Listener.n, Listener.newVal, Listener.newValElse);
                    break;
                case 6:
                    drawIfMoreElse(Listener.n, Listener.newVal, Listener.newValElse);
                    break;
            }
        }
        System.out.println(x);

        if(x != 0){ // if car should move
            if(x > 0){
                direction = 1;
            }
            else if(x < 0){
                direction = 2;
            }
        }

        if (counter == 1) {
            image(backgr1, 0, 0, 1536, 820);
            counter = 0;
        } else {
            image(backgr2, 0, 0, 1536, 820);
            ++counter;
        }

        if (direction == 1) {  // if car is going to the right
            posX = 3;
            posY = 0;
        } else if (direction == 2) {  //  if car is going to the left
            posX = 2;
            posY = 2;
        } else {
            posX = 0;
            posY = 0;
        }

        // pasiimam dali nuotraukos is img i pav. (poszicijaX, pozicijaY, rezX, rezY)
        car = carMap.get(carW*posX+1, carH*posY, 96, 64);

        carPosX += DirectionX[direction];
        distanceFromLeft = 600;
        distanceFromTop = 200;

        XOnScreen = carPosX * speed + distanceFromLeft;
        //    image, X, Y, sizeX, sizeY
        image(car, XOnScreen, carPosY, 96*2, 64*2);

        if (pause) {
            nextMapLoop();
        } else {
            mapManager();
        }
    }

    public void mapManager() {
        if (currentMap == 0) {
            drawObs(sizeOfMap, map1, XOnScreen, carPosY);
            mapProgress++;
            realObsY += 20;
            if (mapPressed) {
                generateMap(map1);
            }
        }

        if (currentMap == 1) {
            drawObs(sizeOfMap, map2, XOnScreen, carPosY);
            mapProgress++;
            realObsY += 20;
            if (mapPressed) {
                generateMap(map2);
            }
        }

        if (currentMap == 2) {
            drawObs(sizeOfMap, map3, XOnScreen, carPosY);
            mapProgress++;
            realObsY += 20;
            if (mapPressed) {
                generateMap(map3);
            }
        }
    }

    public void keyPressed() {
        if (key == 'e') {
            mapPressed = !mapPressed;
        }

        direction = keyCode == RIGHT? 1 : (keyCode == LEFT? 2 : 0);

        // canceling input code:
        x = 0;
        funcNr = 0;
    }

    public void mousePressed() {
        if (pause) {
            pause = false;
        }
        if (mapPressed) {
            if (currentMap == 0) {
                editingMap(map1);
            }
            else if(currentMap == 1){
                editingMap(map2);
            }
            else{
                editingMap(map3);
            }
        }
    }

    public void editingMap(int[][] map) {
        for (int i = 0; i < sizeOfMap; i++) {
            for (int j = 0; j < 3; j++) {
                int x = startX + j * block;
                int y = startY + i * block;
                if ((mouseX >= x) && (mouseX <=  x+block) && (mouseY >= y) && (mouseY <= y+block)) {
                    if (map[i][j] == 1) {
                        map[i][j] = 0;
                    } else {
                        map[i][j] = 1;
                    }
                }
            }
        }
    }

    public void generateMap(int[][] map) {
        textFont(f, 32);
        fill(255);
        text("Map:", startX, 32);

        fill(50);
        rect(startX, startY, 3 * block, sizeOfMap * block);
        fill(255, 0, 0);
        for (int i = 0; i < sizeOfMap; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == 1) {
                    square(startX + j * block, startY + i * block, block);
                }
            }
        }
    }

    public void drawObs(int sizeOfMap, int[][] map, int carX, int carY) {
        realObsX = 0;
        for (int i = 0; i < sizeOfMap; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == 1) {
                    obsY = mapProgress*20+(i)*300-3000;
                    if (j == 0) {  // shifts to left
                        obsX = 720-90-mapProgress;  // 90+ to the left from center of the screen
                        realObsX = 720-90-mapProgress;
                    } else if (j == 2) {  // shifts to right
                        obsX = 720+90+mapProgress;
                        realObsX = obsX = 720+90+mapProgress;
                    } else {  // stays at the center
                        obsX = 720;
                        realObsX = 720;
                    }
                    image(ob, obsX, obsY, 96, 64);

                    if (realObsY > 700) {
                        layer++;
                        realObsY -= 300;
                        if (j == 2) {
                            realObsX += 50;
                        } else if (j == 0) {
                            realObsX -= 50;
                        }
                    }

                    if (layer == 10) {
                        layer = 0;
                        mapProgress = 0;
                        realObsY = -300;
                        currentMap++;
                        if (currentMap == 3) {
                            end();
                        } else {
                            pause = true;
                        }
                    } else if (map[9-layer][j] == 1) {
                        //image(ob2, realObsX, realObsY, 96, 64);
                        if ((carX >= realObsX-120 && carX <= realObsX+30) && (realObsY > 610 && realObsY < 1000)) {
                            gameOver();
                        }
                    }
                }
            }
        }
    }

    public void gameOver() {
        textFont(f, 100);
        fill(255);
        text("GAME OVER", 720, 100);

        noLoop();
    }
    public void end() {
        textFont(f, 60);
        fill(255);
        text("CONGRATULATIONS, YOU WON!", 300, 200);

        noLoop();
    }
    public void nextMapLoop() {
        textFont(f, 90);
        fill(255);
        text("MAP COMPLETE", 700, 100);
        text("NEXT MAP:", 700, 200);

        textFont(f, 30);
        text("PRESS MOUSE TO CONTINUE", 600, 300);
    }

}
