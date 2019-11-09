grammar Gramatica;
gramatica : line+ EOF; 
//Jose, casado(a) com Maria em 01/01/1990, filho de Joao, filho de Marta, amigo(a) de Pedro ha 5 ano(s)
line : name+ ',' relacionamento+ name caracteristica ',' relacionamento name ',' relacionamento name ',' relacionamento name caracteristica;
name : PESSOA;
caracteristica : ('em ' date | 'ha' NUMBER tempo);
date: DATE;
relacionamento : RELACIONAMENTO;
tempo : ('ano(s)' | 'mes(es)' | 'dia(s)');
fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];
RELACIONAMENTO: ('casado(a) com' | 'filho de' | 'amigo(a) de');
PESSOA: (LOWERCASE | UPPERCASE)+;

WHITESPACE: (' ' | '\t') -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
NUMBER: DIGIT+ ([.,] DIGIT+)?;
DIA: DIGIT DIGIT;
MES: DIGIT DIGIT;
ANO: DIGIT DIGIT DIGIT DIGIT ;
DATE: DIA '/' MES '/' ANO;