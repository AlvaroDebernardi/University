declare
class Counter
   attr val
   meth init(V)
      val := V
   end
   meth inc(V)
      val := @val+V
   end
   meth get(X)
      X = @val
   end
end
local C X in
   C = {New Counter init(4)}
   {C get(X)}
   {Browse X}
end