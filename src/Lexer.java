/* The following code was generated by JFlex 1.6.1 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/Lexer.lex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CHAR = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\11\1\4\1\2\2\0\1\1\16\11\4\0\1\3\1\11\1\13"+
    "\1\11\1\11\2\11\1\12\1\47\1\50\1\46\1\44\1\54\1\45"+
    "\1\53\1\14\1\10\11\6\1\41\1\43\1\55\1\42\1\56\2\11"+
    "\5\5\1\40\5\5\1\5\7\5\1\37\6\5\1\57\1\11\1\60"+
    "\1\0\1\7\1\0\1\16\1\34\1\27\1\26\1\22\1\36\1\5"+
    "\1\35\1\17\2\5\1\21\1\15\1\20\1\30\1\24\1\32\1\25"+
    "\1\31\1\23\3\5\1\33\2\5\1\51\1\0\1\52\1\0\41\11"+
    "\1\0\1\11\4\11\1\0\1\11\2\0\1\11\1\11\1\0\1\11"+
    "\7\0\1\11\2\11\2\0\1\11\1\11\3\0\1\11\27\11\1\0"+
    "\37\11\1\0\u01ca\11\4\0\14\11\16\0\5\11\7\0\1\11\1\0"+
    "\1\11\21\0\165\11\1\0\2\11\2\0\4\11\1\11\7\0\1\11"+
    "\1\11\3\11\1\0\1\11\1\0\24\11\1\0\123\11\1\0\213\11"+
    "\1\0\5\11\2\0\236\11\11\0\46\11\2\0\1\11\6\11\1\0"+
    "\47\11\1\0\2\11\4\0\1\11\1\0\55\11\1\11\1\11\1\11"+
    "\2\11\1\11\2\11\1\11\1\11\10\0\33\11\5\0\3\11\2\11"+
    "\13\0\5\11\4\0\2\11\1\11\2\11\2\0\13\11\1\11\2\0"+
    "\2\11\112\11\4\11\146\11\1\11\11\11\1\0\12\11\1\0\23\11"+
    "\2\0\1\11\16\11\1\0\74\11\2\0\145\11\16\0\66\11\1\0"+
    "\3\11\1\11\5\0\56\11\2\0\17\11\1\0\34\11\2\0\1\11"+
    "\101\0\1\11\1\0\13\11\67\0\33\11\1\0\144\11\2\11\12\11"+
    "\1\11\7\11\1\0\7\11\1\0\3\11\1\0\10\11\2\0\2\11"+
    "\2\0\26\11\1\0\7\11\1\0\1\11\3\0\4\11\2\0\11\11"+
    "\2\0\2\11\2\0\4\11\10\0\1\11\4\0\2\11\1\0\5\11"+
    "\2\0\16\11\7\0\1\11\5\0\3\11\1\0\6\11\4\0\2\11"+
    "\2\0\26\11\1\0\7\11\1\0\2\11\1\0\2\11\1\0\2\11"+
    "\2\0\1\11\1\0\5\11\4\0\2\11\2\0\3\11\3\0\1\11"+
    "\7\0\4\11\1\0\1\11\7\0\20\11\13\0\3\11\1\0\11\11"+
    "\1\0\3\11\1\0\26\11\1\0\7\11\1\0\2\11\1\0\5\11"+
    "\2\0\12\11\1\0\3\11\1\0\3\11\2\0\1\11\17\0\4\11"+
    "\2\0\12\11\1\11\1\11\17\0\3\11\1\0\10\11\2\0\2\11"+
    "\2\0\26\11\1\0\7\11\1\0\2\11\1\0\5\11\2\0\11\11"+
    "\2\0\2\11\2\0\3\11\10\0\2\11\4\0\2\11\1\0\5\11"+
    "\2\0\12\11\1\0\1\11\20\0\2\11\1\0\6\11\3\0\3\11"+
    "\1\0\4\11\3\0\2\11\1\0\1\11\1\0\2\11\3\0\2\11"+
    "\3\0\3\11\3\0\14\11\4\0\5\11\3\0\3\11\1\0\4\11"+
    "\2\0\1\11\6\0\1\11\16\0\12\11\11\0\1\11\7\0\3\11"+
    "\1\0\10\11\1\0\3\11\1\0\27\11\1\0\12\11\1\0\5\11"+
    "\3\0\10\11\1\0\3\11\1\0\4\11\7\0\2\11\1\0\2\11"+
    "\6\0\4\11\2\0\12\11\22\0\2\11\1\0\10\11\1\0\3\11"+
    "\1\0\27\11\1\0\12\11\1\0\5\11\2\0\11\11\1\0\3\11"+
    "\1\0\4\11\7\0\2\11\7\0\1\11\1\0\4\11\2\0\12\11"+
    "\1\0\2\11\17\0\2\11\1\0\10\11\1\0\3\11\1\0\51\11"+
    "\2\0\10\11\1\0\3\11\1\0\5\11\10\0\1\11\10\0\4\11"+
    "\2\0\12\11\12\0\6\11\2\0\2\11\1\0\22\11\3\0\30\11"+
    "\1\0\11\11\1\0\1\11\2\0\7\11\3\0\1\11\4\0\6\11"+
    "\1\0\1\11\1\0\10\11\22\0\2\11\1\11\14\0\72\11\4\0"+
    "\20\11\1\11\12\11\2\11\45\0\2\11\1\0\1\11\2\0\2\11"+
    "\1\0\1\11\2\0\1\11\6\0\4\11\1\0\7\11\1\0\3\11"+
    "\1\0\1\11\1\0\1\11\2\0\2\11\1\0\15\11\1\0\3\11"+
    "\2\0\5\11\1\0\1\11\1\0\6\11\2\0\12\11\2\0\4\11"+
    "\40\0\1\11\3\0\17\11\1\0\1\11\3\0\2\11\6\0\12\11"+
    "\13\0\1\11\1\0\1\11\1\0\1\11\4\11\12\11\1\0\44\11"+
    "\4\0\24\11\1\11\22\11\1\0\44\11\11\0\1\11\11\0\5\11"+
    "\4\0\2\11\45\0\112\11\6\11\116\11\2\0\46\11\1\0\1\11"+
    "\5\0\1\11\2\0\53\11\1\11\u014d\11\1\0\4\11\2\0\7\11"+
    "\1\0\1\11\1\0\4\11\2\0\51\11\1\0\4\11\2\0\41\11"+
    "\1\0\4\11\2\0\7\11\1\0\1\11\1\0\4\11\2\0\17\11"+
    "\1\0\71\11\1\0\4\11\2\0\103\11\2\0\3\11\11\11\27\0"+
    "\20\11\20\0\125\11\13\0\1\11\u026c\11\2\11\21\11\1\0\32\11"+
    "\2\11\3\0\113\11\3\11\3\11\17\0\15\11\1\0\7\11\13\0"+
    "\25\11\2\11\11\0\24\11\14\0\15\11\1\0\3\11\1\0\2\11"+
    "\14\0\124\11\3\11\1\11\3\11\3\11\2\0\12\11\26\0\13\11"+
    "\3\11\2\0\12\11\6\0\130\11\10\0\53\11\5\0\106\11\12\0"+
    "\35\11\3\0\14\11\4\0\14\11\10\0\2\11\50\11\2\0\5\11"+
    "\13\0\54\11\4\0\32\11\6\0\12\11\46\0\34\11\2\0\2\11"+
    "\77\11\1\0\35\11\2\0\13\11\6\0\12\11\6\0\7\11\1\11"+
    "\6\11\122\0\114\11\4\0\12\11\7\11\12\0\11\11\14\0\164\11"+
    "\10\0\4\11\70\11\3\0\5\11\12\11\3\0\61\11\2\11\100\0"+
    "\10\11\10\0\3\11\1\11\43\11\11\0\347\11\25\0\u011a\11\2\0"+
    "\6\11\2\0\46\11\2\0\6\11\2\0\10\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\1\0\37\11\2\0\65\11\1\0\7\11\1\0"+
    "\1\11\3\0\3\11\1\0\7\11\3\0\4\11\2\0\6\11\4\0"+
    "\15\11\5\0\3\11\1\0\7\11\16\0\5\11\30\11\2\0\5\11"+
    "\1\0\17\11\2\11\3\11\1\0\15\11\1\0\1\11\1\11\12\11"+
    "\1\0\5\11\5\0\6\11\1\0\1\11\13\0\2\11\1\11\15\0"+
    "\2\11\1\0\15\11\3\0\33\11\25\0\15\11\4\0\1\11\3\0"+
    "\14\11\21\0\1\11\4\0\1\11\2\0\12\11\1\0\1\11\3\0"+
    "\5\11\6\0\1\11\1\0\1\11\1\0\1\11\1\0\4\11\1\0"+
    "\13\11\2\0\4\11\5\0\5\11\4\0\1\11\21\0\51\11\u017f\0"+
    "\4\11\35\0\2\11\u043d\0\16\11\117\0\2\11\37\0\12\11\u0193\0"+
    "\26\11\77\0\4\11\40\0\2\11\u0202\0\57\11\1\0\57\11\1\0"+
    "\205\11\6\0\11\11\5\0\4\11\1\0\2\11\46\11\1\0\1\11"+
    "\5\0\1\11\2\0\70\11\7\0\1\11\1\11\16\0\30\11\11\0"+
    "\7\11\1\0\7\11\1\0\7\11\1\0\7\11\1\0\7\11\1\0"+
    "\7\11\1\0\7\11\1\0\7\11\1\0\40\11\57\11\1\11\23\11"+
    "\u01be\0\3\11\1\0\3\11\12\11\2\0\14\11\1\0\17\11\1\11"+
    "\5\11\2\0\5\11\1\11\3\0\126\11\2\0\2\11\2\0\3\11"+
    "\1\11\132\11\1\11\4\11\5\0\51\11\3\0\136\11\21\0\33\11"+
    "\65\0\20\11\u0200\0\u19b6\11\112\0\u51cd\11\63\0\u048d\11\103\0\56\11"+
    "\2\11\u010d\11\3\11\34\11\24\0\60\11\3\0\1\11\12\11\1\11"+
    "\31\11\7\0\123\11\6\11\37\0\11\11\2\0\147\11\2\0\4\11"+
    "\1\0\4\11\14\0\13\11\115\0\60\11\20\0\1\11\7\0\64\11"+
    "\4\11\10\0\105\11\11\0\2\11\12\11\6\0\30\11\3\11\1\11"+
    "\4\0\56\11\2\11\44\11\13\0\1\11\35\11\3\0\101\11\15\11"+
    "\1\0\13\11\4\0\2\11\40\0\67\11\11\0\16\11\2\0\12\11"+
    "\2\0\4\11\27\11\3\0\2\11\4\0\103\11\30\0\3\11\2\11"+
    "\20\11\2\11\5\11\12\0\6\11\2\0\6\11\2\0\6\11\11\0"+
    "\7\11\1\0\7\11\221\0\53\11\1\11\2\11\2\0\12\11\6\0"+
    "\u2ba4\11\14\0\27\11\4\0\61\11\u2104\0\u016e\11\2\0\152\11\46\0"+
    "\7\11\14\0\5\11\5\0\14\11\1\0\15\11\1\0\5\11\1\0"+
    "\1\11\1\0\2\11\1\0\2\11\1\0\154\11\41\0\u016b\11\2\11"+
    "\20\0\100\11\2\0\66\11\50\0\15\11\3\0\20\11\12\11\6\0"+
    "\7\11\11\0\3\11\2\11\30\11\3\11\3\11\1\0\16\11\1\0"+
    "\1\11\4\0\1\11\1\11\2\11\4\0\5\11\1\0\207\11\2\0"+
    "\1\11\1\0\3\11\1\11\6\11\1\0\4\11\12\11\2\11\3\0"+
    "\2\11\32\11\3\11\1\0\1\11\1\0\32\11\1\11\1\0\1\11"+
    "\1\0\7\11\131\11\3\0\6\11\2\0\6\11\2\0\6\11\2\0"+
    "\3\11\3\0\2\11\3\0\2\11\22\0\3\11\4\0\14\11\1\0"+
    "\32\11\1\0\23\11\1\0\2\11\1\0\17\11\2\0\16\11\42\0"+
    "\173\11\5\0\3\11\75\0\65\11\210\0\1\11\202\0\35\11\3\0"+
    "\61\11\57\0\37\11\21\0\33\11\65\0\36\11\1\0\1\11\44\11"+
    "\4\0\10\11\1\11\5\11\52\0\236\11\2\0\12\11\305\0\1\11"+
    "\u0290\0\6\11\2\0\1\11\1\0\54\11\1\0\2\11\3\0\1\11"+
    "\2\0\27\11\1\0\1\11\250\0\26\11\11\0\1\11\32\11\5\0"+
    "\1\11\100\0\70\11\6\0\2\11\100\0\4\11\1\0\2\11\5\0"+
    "\10\11\1\0\3\11\1\0\33\11\4\0\3\11\4\0\1\11\20\0"+
    "\11\11\7\0\35\11\2\0\1\11\160\0\7\11\11\0\66\11\3\0"+
    "\7\11\26\11\12\0\23\11\46\0\4\11\143\0\111\11\u03b7\0\107\11"+
    "\7\11\30\0\12\11\20\0\73\11\2\11\1\11\4\11\16\0\31\11"+
    "\7\0\12\11\6\0\65\11\1\0\12\11\4\11\60\0\2\11\12\0"+
    "\105\11\4\11\4\0\1\11\2\0\12\11\136\0\6\11\u0288\0\1\11"+
    "\372\0\11\11\167\0\3\11\74\0\70\11\10\0\12\11\u0936\0\u036f\11"+
    "\221\0\143\11\15\0\5\11\u0b8b\0\u042f\11\u33d1\0\u0239\11\65\0\2\11"+
    "\205\0\1\11\101\0\5\11\10\0\1\11\u03bb\0\105\11\13\0\57\11"+
    "\20\0\21\11\u4060\0\2\11\u0c9d\0\1\11\u14c5\0\5\11\3\0\26\11"+
    "\2\0\7\11\36\0\4\11\224\0\3\11\u01bb\0\125\11\1\0\107\11"+
    "\1\0\2\11\2\0\1\11\2\0\2\11\2\0\4\11\1\0\14\11"+
    "\1\0\1\11\1\0\7\11\1\0\101\11\1\0\4\11\2\0\10\11"+
    "\1\0\7\11\1\0\34\11\1\0\4\11\1\0\5\11\1\0\1\11"+
    "\3\0\7\11\1\0\u0154\11\2\0\31\11\1\0\31\11\1\0\37\11"+
    "\1\0\31\11\1\0\37\11\1\0\31\11\1\0\37\11\1\0\31\11"+
    "\1\0\37\11\1\0\31\11\1\0\10\11\2\0\62\11\u1600\0\4\11"+
    "\1\0\33\11\1\0\2\11\1\0\1\11\2\0\1\11\1\0\12\11"+
    "\1\0\4\11\1\0\1\11\1\0\1\11\6\0\1\11\4\0\1\11"+
    "\1\0\1\11\1\0\1\11\1\0\3\11\1\0\2\11\1\0\1\11"+
    "\2\0\1\11\1\0\1\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\1\0\2\11\1\0\1\11\2\0\4\11\1\0\7\11\1\0\4\11"+
    "\1\0\4\11\1\0\1\11\1\0\12\11\1\0\21\11\5\0\3\11"+
    "\1\0\5\11\1\0\21\11\u1144\0\ua6d7\11\51\0\u1035\11\13\0\336\11"+
    "\u3fe2\0\u021e\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\11\36\0\140\11\200\0\360\11\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\5\1\4\2\1"+
    "\1\6\12\3\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\2\0\1\30\12\3\1\31\1\32"+
    "\1\3\1\33\1\3\1\34\1\35\1\36\1\3\1\37"+
    "\2\3\1\40\1\3\1\41\2\3\1\42\1\43\2\3"+
    "\1\44\1\45\3\3\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\142\0\304\0\365\0\142"+
    "\0\142\0\u0126\0\u0157\0\142\0\u0188\0\u01b9\0\u01ea\0\u021b"+
    "\0\u024c\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\304\0\304"+
    "\0\u0372\0\142\0\142\0\142\0\142\0\142\0\142\0\142"+
    "\0\142\0\142\0\142\0\142\0\142\0\142\0\142\0\u03a3"+
    "\0\u0157\0\u0157\0\u03d4\0\u0405\0\u0436\0\u0467\0\u0498\0\u04c9"+
    "\0\u04fa\0\u052b\0\u055c\0\u058d\0\142\0\142\0\u05be\0\304"+
    "\0\u05ef\0\304\0\304\0\304\0\u0620\0\304\0\u0651\0\u0682"+
    "\0\304\0\u06b3\0\304\0\u06e4\0\u0715\0\304\0\304\0\u0746"+
    "\0\u0777\0\304\0\304\0\u07a8\0\u07d9\0\u080a\0\304";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\3\5\1\6\1\7\1\10\1\11\1\3"+
    "\1\12\1\13\1\14\1\15\1\6\1\16\1\6\1\17"+
    "\1\6\1\20\1\21\1\22\1\23\1\24\1\6\1\25"+
    "\4\6\1\26\1\27\1\30\1\31\1\3\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\61\3\63\0\1\5\63\0"+
    "\4\6\4\0\24\6\26\0\1\7\1\0\1\7\53\0"+
    "\1\50\1\0\35\50\1\0\1\50\1\0\10\50\2\0"+
    "\2\50\3\0\1\51\1\0\6\51\1\52\26\51\1\0"+
    "\1\51\1\0\10\51\2\0\2\51\5\0\4\6\4\0"+
    "\1\6\1\53\22\6\25\0\4\6\4\0\3\6\1\54"+
    "\20\6\25\0\4\6\4\0\5\6\1\55\16\6\25\0"+
    "\4\6\4\0\13\6\1\56\10\6\25\0\4\6\4\0"+
    "\10\6\1\57\13\6\25\0\4\6\4\0\1\6\1\60"+
    "\22\6\25\0\4\6\4\0\2\6\1\61\21\6\25\0"+
    "\4\6\4\0\20\6\1\62\3\6\25\0\4\6\4\0"+
    "\5\6\1\63\16\6\25\0\4\6\4\0\4\6\1\64"+
    "\17\6\62\0\1\65\30\0\1\66\53\0\4\6\4\0"+
    "\2\6\1\67\21\6\25\0\4\6\4\0\6\6\1\70"+
    "\2\6\1\71\12\6\25\0\4\6\4\0\3\6\1\72"+
    "\2\6\1\73\15\6\25\0\4\6\4\0\7\6\1\74"+
    "\14\6\25\0\4\6\4\0\2\6\1\75\21\6\25\0"+
    "\4\6\4\0\6\6\1\76\15\6\25\0\4\6\4\0"+
    "\12\6\1\77\11\6\25\0\4\6\4\0\1\6\1\100"+
    "\22\6\25\0\4\6\4\0\15\6\1\101\6\6\25\0"+
    "\4\6\4\0\13\6\1\102\10\6\25\0\4\6\4\0"+
    "\3\6\1\103\20\6\25\0\4\6\4\0\5\6\1\104"+
    "\16\6\25\0\4\6\4\0\3\6\1\105\20\6\25\0"+
    "\4\6\4\0\6\6\1\106\15\6\25\0\4\6\4\0"+
    "\10\6\1\107\13\6\25\0\4\6\4\0\1\6\1\110"+
    "\22\6\25\0\4\6\4\0\16\6\1\111\5\6\25\0"+
    "\4\6\4\0\6\6\1\112\15\6\25\0\4\6\4\0"+
    "\6\6\1\113\15\6\25\0\4\6\4\0\17\6\1\114"+
    "\4\6\25\0\4\6\4\0\13\6\1\115\10\6\25\0"+
    "\4\6\4\0\13\6\1\116\10\6\25\0\4\6\4\0"+
    "\4\6\1\117\17\6\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2107];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\2\1\2\11\2\1\1\11"+
    "\15\1\16\11\2\0\13\1\2\11\31\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

  StringBuffer string = new StringBuffer();

  private boolean debug_mode;
  public  boolean debug()            { return debug_mode; }
  public  void    debug(boolean mode){ debug_mode = mode; }

  private void print_lexeme(int type, Object value){
    if(!debug()){ return; }

    System.out.print("<");
    switch(type){
      case sym.LET:
        System.out.print("LET"); break;
      case sym.EQUAL:
        System.out.print(":="); break;
      case sym.SEMICOL:
        System.out.print(";"); break;
      case sym.PLUS:
        System.out.print("+"); break;
      case sym.MINUS:
        System.out.print("-"); break;
      case sym.MULT:
        System.out.print("*"); break;
      case sym.DIV:
        System.out.print("/"); break;
      case sym.MAIN:
        System.out.print("main"); break;
      case sym.LPAREN:
        System.out.print("("); break;
      case sym.RPAREN:
        System.out.print(")"); break;
      case sym.L_CBRACK:
        System.out.print("{"); break;
      case sym.R_CBRACK:
        System.out.print("}"); break;
      case sym.INTEGER:
        System.out.printf("INT %d", value); break;
      case sym.IDENTIFIER:
        System.out.printf("IDENT %s", value); break;
      case sym.PRINT:
        System.out.printf("print"); break;
      //case sym.STRING_LITERAL:
      //            System.out.printf("STRING_LITERAL %s", value); break;
      case sym.CHAR:
                  System.out.printf("CHAR %c", value); break;      // EDIT CHAR !!

      case sym.BOOL_TYPE:
              System.out.printf("bool");            break;
      case sym.CHAR_TYPE:
                    System.out.printf("char type"); break;
      case sym.INT_TYPE:
                    System.out.printf("int type");  break;

    }
    System.out.print(">  ");
  }

  private Symbol symbol(int type) {
    print_lexeme(type, null);
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    print_lexeme(type, value);
    return new Symbol(type, yyline, yycolumn, value);
  }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2824) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
            }
          case 39: break;
          case 2: 
            { /* do nothing */
            }
          case 40: break;
          case 3: 
            { return symbol(sym.IDENTIFIER, yytext());
            }
          case 41: break;
          case 4: 
            { return symbol(sym.INTEGER, Integer.parseInt(yytext()));
            }
          case 42: break;
          case 5: 
            { return symbol(sym.UNDERSCORE);
            }
          case 43: break;
          case 6: 
            { return symbol(sym.DIV);
            }
          case 44: break;
          case 7: 
            { return symbol(sym.TRUE);
            }
          case 45: break;
          case 8: 
            { return symbol(sym.FALSE);
            }
          case 46: break;
          case 9: 
            { return symbol(sym.DEUX_POINTS);
            }
          case 47: break;
          case 10: 
            { return symbol(sym.SEMICOL);
            }
          case 48: break;
          case 11: 
            { return symbol(sym.PLUS);
            }
          case 49: break;
          case 12: 
            { return symbol(sym.MINUS);
            }
          case 50: break;
          case 13: 
            { return symbol(sym.MULT);
            }
          case 51: break;
          case 14: 
            { return symbol(sym.LPAREN);
            }
          case 52: break;
          case 15: 
            { return symbol(sym.RPAREN);
            }
          case 53: break;
          case 16: 
            { return symbol(sym.L_CBRACK);
            }
          case 54: break;
          case 17: 
            { return symbol(sym.R_CBRACK);
            }
          case 55: break;
          case 18: 
            { return symbol(sym.PERIOD_SYM);
            }
          case 56: break;
          case 19: 
            { return symbol(sym.COMMA);
            }
          case 57: break;
          case 20: 
            { return symbol(sym.INF);
            }
          case 58: break;
          case 21: 
            { return symbol(sym.SUP);
            }
          case 59: break;
          case 22: 
            { return symbol(sym.LSQ_BRACK);
            }
          case 60: break;
          case 23: 
            { return symbol(sym.RSQ_BRACK);
            }
          case 61: break;
          case 24: 
            { return symbol(sym.STRING);
            }
          case 62: break;
          case 25: 
            { return symbol(sym.EQUAL);
            }
          case 63: break;
          case 26: 
            { return symbol(sym.CHAR);
            }
          case 64: break;
          case 27: 
            { return symbol(sym.INT_TYPE);
            }
          case 65: break;
          case 28: 
            { return symbol(sym.LEN);
            }
          case 66: break;
          case 29: 
            { return symbol(sym.LET);
            }
          case 67: break;
          case 30: 
            { return symbol(sym.TOP);
            }
          case 68: break;
          case 31: 
            { return symbol(sym.RAT_TYPE);
            }
          case 69: break;
          case 32: 
            { return symbol(sym.SEQUENCE);
            }
          case 70: break;
          case 33: 
            { return symbol(sym.MAIN);
            }
          case 71: break;
          case 34: 
            { return symbol(sym.DICTIONARY);
            }
          case 72: break;
          case 35: 
            { return symbol(sym.CHAR_TYPE);
            }
          case 73: break;
          case 36: 
            { return symbol(sym.PRINT);
            }
          case 74: break;
          case 37: 
            { return symbol(sym.FLOAT_TYPE);
            }
          case 75: break;
          case 38: 
            { return symbol(sym.BOOL_TYPE);
            }
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
