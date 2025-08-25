program Pascal;

Var x:Integer;

arr : array [0..1] of Integer;

begin
    arr[0] := 1;
    arr[1] := 2;
    arr[100] := 3;

    writeln('arr[0] = ',arr[0]);
    writeln('arr[1] = ',arr[1]);
    writeln('arr[100] = ',arr[100]);
end.
