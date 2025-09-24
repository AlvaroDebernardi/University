lenght([],0).
lenght([L|Ls],N):-lenght(Ls,M), N is M+1.
