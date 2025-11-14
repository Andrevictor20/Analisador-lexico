package br.com.analisadorlexico;

class Interpreter implements Expr.Visitor<Object> {
    @Override
    public Object visitLiteralExpr(Expr.Literal expr) {
        return expr.value;
    }
    private Object evaluate(Expr expr) {
    return expr.accept(this);
  }
}
