lenght([],0).
lenght([_|Ls],N) :- lenght(Ls,M), N is M + 1.

ls_acotada([],N).
ls_acotada([L|Ls],N):-
    L=<N,
    ls_acotada(Ls,N).

lista_acotada(Ls) :- 
    lenght(Ls,N),
    ls_acotada(Ls,N).
