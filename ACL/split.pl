split(Ls,0,[],Ls).
split([L|Ls],N,[L|L1],L2):-split(Ls,M,L1,L2),N is M+1.

