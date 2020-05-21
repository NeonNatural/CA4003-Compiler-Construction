import java.util.*;

/*
Is every identifier declared within scope before its is used?
Is no identifier declared more than once in the same scope?
Is the left-hand side of an assignment a variable of the correct type?
Are the arguments of an arithmetic operator the integer variables or integer constants?
Are the arguments of a boolean operator boolean variables or boolean constants?
Is there a function for every invoked identifier?
Does every function call have the correct number of arguments?
Is every variable both written to and read from?
Is every function called?
*/

public class SemanticCheckVisitor implements CcalParserVisitor{


  private static String scope = "global";


  public Object visit(SimpleNode node, Object data){
    throw new RuntimeException("Visit SimpleNode");
  }

  public Object visit(ASTprogram node, Object data){
    return node.value;

  }

  public Object visit(ASTvardec node, Object data){
    return node.value;
  }

  public Object visit(ASTconstdec node, Object data){
    return node.value;
  }


  public Object visit(ASTplus node, Object data){
    return node.value;
    }

  public Object visit(ASTminus node, Object data){
    return node.value;
  }

  public Object visit(ASTassignment1 node, Object data){

    return node.value;
  }

  public Object visit(ASTeq_to node, Object data){
    return node.value;
  }
  public Object visit(ASTnot_eq node, Object data){
    return node.value;
  }
  public Object visit(ASTlessthan node, Object data){
    return node.value;
  }
  public Object visit(ASTlessthan_equal node, Object data){
    return node.value;
  }
  public Object visit(ASTgreaterthan node, Object data){
    return node.value;
  }
  public Object visit(ASTgreaterthan_equal node, Object data){
    return node.value;
  }

  public Object visit(ASTcondition node, Object data){
    return node.value;
  }
  public Object visit(ASTand_con node, Object data){
    return node.value;
  }
  public Object visit(ASTor_con node, Object data){
    return node.value;
  }

  public Object visit(ASTfragment node, Object data){
    return node.value;
  }
  public Object visit(ASTret node, Object data){

    return node.value;
  }
  public Object visit(ASTnum node, Object data){
    return node.value;
  }

  public Object visit(ASTbool_true node, Object data)
  {
    return node.value;
  }
  public Object visit(ASTboo_false node, Object data){
    return node.value;
  }
  public Object visit(ASTstatement node, Object data){
    return node.value;
  }
  public Object visit(ASTN_parameterlist node, Object data){
    return node.value;
  }
  public Object visit(ASTidentifier node, Object data){
    return node.value;
  }
  public Object visit(ASTfunction node, Object data){
    return node.value;
  }

  public Object visit(ASTarg node, Object data){
    return node.value;
  }

  public Object visit(ASTtype node, Object data){
    return node.value;
  }

  public Object visit(ASTmain node, Object data){
    return node.value;
  }
  public Object visit(ASTarglist node, Object data){
    return node.value;
  }

}
