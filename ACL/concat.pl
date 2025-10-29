concat([],Y,Y).
concat([X|Xs],Y,[X|Z]) :- concat(Xs,Y,Z).
