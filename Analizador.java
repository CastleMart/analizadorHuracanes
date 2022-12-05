/* Generated By:JavaCC: Do not edit this line. Analizador.java */
public class Analizador implements AnalizadorConstants {
    public static void main (String[] args) {
        try{
            Analizador checador =  new Analizador(System.in);
            System.out.println("ocean,numCycl,year,name,numTrcks,yearTrck,monthTrck,dayTrck,hourTrck,minutsTrck,recordId,statusSys,latitude,longitude,maxSustWin,minPress,34ktNE,34ktSE,34ktSW,34ktNW,50ktNE,50ktSE,50ktSW,50ktNW,64ktNE,64ktSE,64ktSW,64ktNW,radMaxWind");
            checador.run();
            System.out.println("Se ha compilado correctamente  :)");
        }
        catch (ParseException e){
            System.out.println("Hay un error  :(");
            System.out.println(e.getMessage());
        }
    }

/*TOKEN : {

<MINUTO:<NUM> <NUM><COMA> > {System.out.println("MINUTO");}|
<HORARIO:" " <HORA><MINUTO>>{System.out.println("HORARIO -- " + image);}|
<DIA: ["0"-"3"] <NUM>> {System.out.print("DIA ");} |
<MES:["0"-"1"]<NUM>> {System.out.print("MES ");}|
<ANIO:(<NUM>){4}> {System.out.print("AÑO ");}|

}*/
  static final public void run() throws ParseException {
            Token t; String cadena, auxiliar, id;
    label_1:
    while (true) {
      id = huracan();

      label_2:
      while (true) {
        t = jj_consume_token(FECHA);
                    auxiliar = t.image;
                    cadena =auxiliar.substring(0,4) + "," + auxiliar.substring(4,6) + "," + auxiliar.substring(6);
        t = jj_consume_token(VALOR);
                    auxiliar = t.image;
                    cadena =cadena + auxiliar.substring(0,2) + "," + auxiliar.substring(2);
        t = jj_consume_token(RECID);
                            cadena = cadena + t.image;
        t = jj_consume_token(LATITUD);
                              cadena = cadena + t.image;
        t = jj_consume_token(LONGITUD);
                               cadena = cadena + t.image;
        t = jj_consume_token(VALOR);
                            cadena = cadena + t.image;
        label_3:
        while (true) {
          t = jj_consume_token(VALOR);
                             cadena = cadena + t.image;
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case VALOR:
            ;
            break;
          default:
            jj_la1[0] = jj_gen;
            break label_3;
          }
        }
                 System.out.print(id + cadena);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case FECHA:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFICADOR:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_1;
      }
    }
  }

  static final public String huracan() throws ParseException {
                  Token t; String cadena, auxiliar;
    t = jj_consume_token(IDENTIFICADOR);
        cadena = t.image;
        cadena = cadena.substring(0,2) + "," + cadena.substring(2,4) + "," + cadena.substring(4);
    t = jj_consume_token(NOMBRE);
                 cadena = cadena + t.image;
    t = jj_consume_token(NUMFILAS);
        cadena = cadena + t.image;
        {if (true) return cadena;}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public AnalizadorTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[3];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x2000,0x200,0x40,};
   }

  /** Constructor with InputStream. */
  public Analizador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Analizador(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AnalizadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Analizador(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AnalizadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Analizador(AnalizadorTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AnalizadorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[16];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 3; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 16; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
