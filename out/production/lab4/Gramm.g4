grammar Gramm;

prog : statement + EOF;
statement : for | whileTrue | whileLess | whileMore | ifLess | ifMore | ifLessElse | ifMoreElse | continue |
    doWhileLess | doWhileMore |
    stay | goLeft | goRight | goLeftFast | goRightFast | reverse | goLeftX | goRightX;

// --------- java code:
for     : 'for(int i' '=' '0;' 'i' '<' INT ';' 'i++)' '{' 'x' '=' INT ';' '}';

whileTrue   : 'while(' 'true' ')' '{' 'x' '=' INT ';' '}';
whileLess   : 'while(' 'x' '<' INT ')' '{' 'x' '=' INT ';' '}';
whileMore   : 'while(' 'x' '>' INT ')' '{' 'x' '=' INT ';' '}';

ifLess  : 'if(' 'x' '<' INT ')' '{' 'x' '=' INT ';' '}';
ifMore  : 'if(' 'x' '>' INT ')' '{' 'x' '=' INT ';' '}';

ifLessElse  : 'if(' 'x' '<' INT ')' '{' 'x' '=' INT ';' '}' 'else{' 'x' '=' INT ';' '}';
ifMoreElse  : 'if(' 'x' '>' INT ')' '{' 'x' '=' INT ';' '}' 'else{' 'x' '=' INT ';' '}';

continue    : 'continue;';

doWhileLess : 'do{' 'x' '=' INT ';' '}while(' 'x' '<' INT ')';
doWhileMore : 'do{' 'x' '=' INT ';' '}while(' 'x' '>' INT ')';

//---------- pseudo code:

stay        : 'stay';
goLeft      : 'goLeft';
goRight     : 'goRight';
goLeftFast  : 'goLeftFast';
goRightFast : 'goRightFast';
reverse     : 'reverse';
goLeftX     : 'goLeftX' INT;
goRightX    : 'goRightX ' INT;


WS      : [ \t\n]+ -> skip;
INT  : [-]*[0-9][0-9]*;
STRING    : [a-zA-Z][a-zA-Z]*;

