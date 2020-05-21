/* Generated By:JavaCC: Do not edit this line. CcalParserConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CcalParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int VAR = 12;
  /** RegularExpression Id. */
  int INT = 13;
  /** RegularExpression Id. */
  int CONST = 14;
  /** RegularExpression Id. */
  int RET = 15;
  /** RegularExpression Id. */
  int BOOL = 16;
  /** RegularExpression Id. */
  int VOID = 17;
  /** RegularExpression Id. */
  int MAIN = 18;
  /** RegularExpression Id. */
  int IF = 19;
  /** RegularExpression Id. */
  int ELSE = 20;
  /** RegularExpression Id. */
  int TRUE = 21;
  /** RegularExpression Id. */
  int FALSE = 22;
  /** RegularExpression Id. */
  int WHILE = 23;
  /** RegularExpression Id. */
  int SKIP_ = 24;
  /** RegularExpression Id. */
  int COMMA = 25;
  /** RegularExpression Id. */
  int ASSIGNMENT = 26;
  /** RegularExpression Id. */
  int DOT = 27;
  /** RegularExpression Id. */
  int SEMI_COLON = 28;
  /** RegularExpression Id. */
  int COLON = 29;
  /** RegularExpression Id. */
  int LEFT_BRACE = 30;
  /** RegularExpression Id. */
  int RIGHT_BRACE = 31;
  /** RegularExpression Id. */
  int LEFT_BRACKET = 32;
  /** RegularExpression Id. */
  int RIGHT_BRACKET = 33;
  /** RegularExpression Id. */
  int PLUS = 34;
  /** RegularExpression Id. */
  int MINUS = 35;
  /** RegularExpression Id. */
  int NOT = 36;
  /** RegularExpression Id. */
  int OR = 37;
  /** RegularExpression Id. */
  int AND = 38;
  /** RegularExpression Id. */
  int EQUALTO = 39;
  /** RegularExpression Id. */
  int NOT_EQUAL = 40;
  /** RegularExpression Id. */
  int LESS_THAN = 41;
  /** RegularExpression Id. */
  int GREATER_THAN = 42;
  /** RegularExpression Id. */
  int LTHAN_EQUALTO = 43;
  /** RegularExpression Id. */
  int GTHAN_EQUALTO = 44;
  /** RegularExpression Id. */
  int NUMBER = 45;
  /** RegularExpression Id. */
  int DIGIT = 46;
  /** RegularExpression Id. */
  int ID = 47;
  /** RegularExpression Id. */
  int LETTER = 48;
  /** RegularExpression Id. */
  int OTHER = 49;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_COMMENT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"\\f\"",
    "<token of kind 7>",
    "\"/*\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 11>",
    "\"var\"",
    "\"integer\"",
    "\"const\"",
    "\"return\"",
    "\"boolean\"",
    "\"void\"",
    "\"main\"",
    "\"if\"",
    "\"else\"",
    "\"true\"",
    "\"false\"",
    "\"while\"",
    "\"skip\"",
    "\",\"",
    "\"=\"",
    "\".\"",
    "\";\"",
    "\":\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"+\"",
    "\"-\"",
    "\"~\"",
    "\"||\"",
    "\"&&\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "<NUMBER>",
    "<DIGIT>",
    "<ID>",
    "<LETTER>",
    "<OTHER>",
  };

}