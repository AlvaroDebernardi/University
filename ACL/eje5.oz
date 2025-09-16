declare
proc {Append A B ?C}
   case A
   of nil then C=B
   [] X|As then Cs in
      {Append As B Cs}
      C=X|Cs
   end
end

local X in
   {Append [1 2] X [1 2 3]}
   {Browse X}
end
