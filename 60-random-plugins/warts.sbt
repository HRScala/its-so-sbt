wartremoverWarnings in (Compile, compile) ++= Seq(
  Wart.Product
, Wart.Serializable
)

wartremoverErrors in (Compile, compile) ++= Seq(
  Wart.Any2StringAdd
, Wart.Enumeration
, Wart.JavaConversions
, Wart.Return
)
