grammar Gramm;

prog : statement + EOF;
statement : for | while | ifLess | ifMore | ifLessElse | ifMoreElse;

for     : 'for(int i' '=' '0;' 'i' '<' INT ';' 'i++)' '{' 'x' '=' INT ';' '}';
while   : 'while(' 'true' ')' '{' 'x' '=' INT ';' '}';
ifLess  : 'if(' 'x' '<' INT ')' '{' 'x' '=' INT ';' '}';
ifMore  : 'if(' 'x' '>' INT ')' '{' 'x' '=' INT ';' '}';

ifLessElse  : 'if(' 'x' '<' INT ')' '{' 'x' '=' INT ';' '}' 'else{' 'x' '=' INT ';' '}';
ifMoreElse  : 'if(' 'x' '>' INT ')' '{' 'x' '=' INT ';' '}' 'else{' 'x' '=' INT ';' '}';


WS      : [ \t\n]+ -> skip;

INT  : [-]*[0-9][0-9]*;

//whileElse

