/* Generated By:JavaCC: Do not edit this line. AnalizadorTokenManager.java */

/** Token Manager. */
public class AnalizadorTokenManager implements AnalizadorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 44:
         return jjStartNfaWithStates_0(0, 21, 52);
      case 45:
         return jjStopAtPos(0, 2);
      case 46:
         return jjStopAtPos(0, 1);
      case 58:
         return jjStopAtPos(0, 3);
      default :
         return jjMoveNfa_0(7, 0);
   }
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 52;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 52:
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(0, 2);
                  else if (curChar == 44)
                     jjCheckNAddTwoStates(27, 28);
                  if ((0x3f000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  if ((0x7000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 6);
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 9:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 11:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 13:
                  if ((0x3f000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L && kind > 12)
                     kind = 12;
                  break;
               case 26:
                  if (curChar == 44)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(0, 2);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 42:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 44:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 46:
                  if ((0x7000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 6);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 49:
                  if ((0x3f000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) != 0L && kind > 13)
                     kind = 13;
                  break;
               case 51:
                  if ((0x7000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(51, 26);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 52:
               case 28:
                  if (curChar == 78 && kind > 16)
                     kind = 16;
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAdd(8);
                  }
                  if ((0x9d1288L & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  else if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 24;
                  else if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 0;
                  if (curChar == 83)
                     jjCheckNAddTwoStates(31, 32);
                  else if (curChar == 84)
                     jjCheckNAddTwoStates(31, 32);
                  else if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 22;
                  else if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 20;
                  if (curChar == 83)
                  {
                     if (kind > 16)
                        kind = 16;
                  }
                  break;
               case 0:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(8);
                  break;
               case 15:
                  if ((0x9d1288L & l) != 0L && kind > 14)
                     kind = 14;
                  break;
               case 16:
                  if (curChar == 85 && kind > 15)
                     kind = 15;
                  break;
               case 17:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 88 && kind > 15)
                     kind = 15;
                  break;
               case 19:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 79 && kind > 15)
                     kind = 15;
                  break;
               case 21:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 86 && kind > 15)
                     kind = 15;
                  break;
               case 23:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 66 && kind > 15)
                     kind = 15;
                  break;
               case 25:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 29:
                  if (curChar == 83 && kind > 16)
                     kind = 16;
                  break;
               case 30:
                  if (curChar == 84)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 31:
                  if (curChar == 68 && kind > 15)
                     kind = 15;
                  break;
               case 32:
                  if (curChar == 83 && kind > 15)
                     kind = 15;
                  break;
               case 33:
                  if (curChar == 83)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 52 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   35, 36, 39, 47, 48, 51, 26, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\56", "\55", "\72", null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x1ffffL, 
};
static final long[] jjtoSkip = {
   0x3e0000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[52];
static private final int[] jjstateSet = new int[104];
static StringBuffer image;
static int jjimageLen;
static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public AnalizadorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public AnalizadorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 52; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         tokenImage = "";
      else
         tokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      tokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 5;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 1 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[1]);
        lengthOfMatch = jjstrLiteralImages[1].length();
                   System.out.println("PUNTO");
         break;
      case 2 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[2]);
        lengthOfMatch = jjstrLiteralImages[2].length();
                      System.out.println("NE    GATIVO o GUI\u00d3N");
         break;
      case 3 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[3]);
        lengthOfMatch = jjstrLiteralImages[3].length();
                        System.out.println("DOS PUNTOS");
         break;
      case 4 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                   System.out.println("IDENTIFICADOR");
         break;
      case 5 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() && 
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                               System.out.println("NOMBRE");
         break;
      case 6 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                System.out.println("NUMFILAS");
         break;
      case 7 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                            System.out.print("DIA ");
         break;
      case 8 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                           System.out.print("MES ");
         break;
      case 9 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                       System.out.print("A\u00d1O ");
         break;
      case 10 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("FECHA");
         break;
      case 11 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                            System.out.println("HORA");
         break;
      case 12 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                              System.out.println("MINUTO");
         break;
      case 13 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                         System.out.println("HORARIO");
         break;
      case 14 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                             System.out.println("RECORDIDENT");
         break;
      case 15 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                              System.out.println("ESTADOSISTEMA");
         break;
      case 16 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                  System.out.println("LATITUD");
         break;
      default : 
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
