package parser;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LBRACKET = 2;
		static public final short LPAREN = 3;
		static public final short MINUS = 4;
		static public final short STRING_LITERAL = 5;
		static public final short INT_LITERAL = 6;
		static public final short TRUE = 7;
		static public final short FALSE = 8;
		static public final short RPAREN = 9;
		static public final short RCURLY = 10;
		static public final short VOID = 11;
		static public final short BOOLEAN = 12;
		static public final short INT = 13;
		static public final short LCURLY = 14;
		static public final short SEMICOLON = 15;
		static public final short IF = 16;
		static public final short RBRACKET = 17;
		static public final short WHILE = 18;
		static public final short BREAK = 19;
		static public final short RETURN = 20;
		static public final short COMMA = 21;
		static public final short EQL = 22;
		static public final short IMPORT = 23;
		static public final short PUBLIC = 24;
		static public final short PLUS = 25;
		static public final short TIMES = 26;
		static public final short DIV = 27;
		static public final short MOD = 28;
		static public final short TYPE = 29;
		static public final short MODULE = 30;
		static public final short ELSE = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LT = 34;
		static public final short LEQ = 35;
		static public final short GT = 36;
		static public final short GEQ = 37;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pDLcTq5KKOlRilX2G2pnWW86XYW10WWH0W942AgQGNa2QWW5W11HKxOCEANJY77tgEFqH" +
		"HGQHPK268M52mWM015GKHZTXGB9ztPoUFpMRV2pd8EUwU#xMvyytix3J0d8qYPA8QjHY1KS" +
		"Z1C5o1mSX076RZ6dH49tJ6gUY2hZWDfwDzYzYnBM9t2ydkvMA7ulPf0JVLnRqUKp4QbHY9i" +
		"t0XBe8fNs8kvk569A0LUk019AC$1hXvylXHdXmXp#VDm$qkNbWm7XuAjDkQl9E3yEuI2V0U" +
		"3Du$d8dSGBj$akVNFFVOdAl6vjYYFLLq1Yx5PPY9MRWSvx2TV4mWioR0pCFvJMhszSmto3C" +
		"wr3CwnZCwnJDwIOZeEDSubJXwFj1TAayruRlzESqotBvph7AGtUBwn#ktnN0KArcAS1GY0f" +
		"5AHk4ajD6ooj77Et2RMZa5j4vHCiQUMV8DulKSi#N568#RDBi3xiOPY4OxvPMX71Msb7hSW" +
		"F5o25V9NjmgF#9QsSlOdUWjNw4x4f64Mv22VaYZpa8wpiPOJ9IdCGddiONfz8TWCjyBC0rN" +
		"uchSZEja7#RBrxYTVsC1xi5zk1SFOo5NL2BdR1BtajxS8vAPjI$pfd8Tf74b3EJyIrTp8fC" +
		"PXtA6$5$O9ufhmEG#5SPzBPnxJ0HtF$jlj#LVokUEKyZ$6yCztyshSV2Yo3E2y3gvUEs2yc" +
		"8RyNn1U7xWcFgNmxtEgt$UOzEIQ3pdS09FgkxSGIjKEzKkPiL$qCg9Yhh7oSdoDocDR19n#" +
		"z7DCaArQFMhfVMFry$c#PIdPG7ZHLgMght8biu#6dhbTAOLgMGxFREiqR4jMrhj56js56yI" +
		"VkwmjcVVBMnfzyUIaMJRsf9nh1F5aaZkavRqKrTHPj6stXA#9hqitfewy8tcwoU64v6KLXR" +
		"hRtHaj1MrdoiAM3GFwfb9B2LM4Ak9HudDn1vY9L5lyHe0c5RT8yGssbs93aGC$VdKlNJEnR" +
		"JpdVNSO7aF8b7pbz4kqF5om7Y4kfXE7NKAzNPTLiMo9TIbT0xeMA6jZJdQ7#vgfunbopN7m" +
		"beTz#aOlzKCTzM9rsLRQNThsdTZHwXlqvpTh5kjy$NHiGMqQtIibgZGyNsqAxLTJtk4AzTX" +
		"naOIuqEtQOxMEeyOfUqYOeosSvXheKUzOSGa8ex89QOGqtHP2J51spE8SSHqOhAZ$aIjPn5" +
		"JZyPHwxJPTftZcpPvz2FSKRw$mHQHNGxxKAWnQ9eJ4Iw$NkiuhGSvscoZOsMDwnYnmVCR2R" +
		"hlhMalrlLNwR8mYlqk$dgjETx6Hezy1vl$9YFbg6rsqMtkRCmnOpGtWtPxpTdhaIjVynEQQ" +
		"pTqdynkp5Nf4MzOI#ArbfhFYySyOekW7$bRVbAQKlwGt#KmN8$yfkGNiaTso#VocNmgdwZ8" +
		"BYLt1dWV4pi2tdRY8#93uWDvJxR96bfRvMtAjsI3RAJU87MoNbwLTV8AlNNoihmaByeBj9#" +
		"NjR96LiigMIdFoGgLyLdP8kygwndY2Lcgv9CgiaIMop9bRP5tv4rvGpRBwx99NcFaVHN$Li" +
		"a3ieNoE$b1lfU3ZRvolvA$1lnVv6UEpJ$A$ejYBEzbuRmNcGHuD$BnR3C9y7mp0YZbML76C" +
		"w#St6pwsIplhyuv6saE362E1XGpLwK2UDxu2F0MQnBWlT88Ya7afXE3UIuDvXcSGPt9UaCK" +
		"VBo5choT60hzwFTKvrmO0NLZIMMiYjeBAUJciZoNt1pw5f8PosEC#oDFUIE0HCOJgPE2mgV" +
		"EUmkzs7urTJLpLB1U2SkuH$96u4Fjl$YaQYC=");

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	static final Action RETURN7 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 7];
		}
	};

	// turn off automated error recovery
	@Override
	protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
		super.recoverFromError(new Symbol(0), in);
	}

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			RETURN6,	// [0] Module = MODULE ID LCURLY Imports Declarations RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [1] Imports = Import Imports; returns 'Imports' although none is marked
			Action.NONE,  	// [2] Imports = 
			RETURN3,	// [3] Import = IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [4] Declarations = Declaration Declarations; returns 'Declarations' although none is marked
			Action.NONE,  	// [5] Declarations = 
			Action.RETURN,	// [6] Declaration = FunctionDeclaration
			Action.RETURN,	// [7] Declaration = FieldDeclaration
			Action.RETURN,	// [8] Declaration = TypeDeclaration
			RETURN9,	// [9] FunctionDeclaration = AccessId TypeName ID LPAREN ParameterList RPAREN LCURLY Statements RCURLY; returns 'RCURLY' although none is marked
			RETURN4,	// [10] FieldDeclaration = AccessId TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [11] TypeDeclaration = AccessId TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [12] AccessId = PUBLIC
			Action.NONE,  	// [13] AccessId = 
			Action.RETURN,	// [14] TypeName = PrimitiveType
			Action.RETURN,	// [15] TypeName = ArrayType
			Action.RETURN,	// [16] TypeName = ID
			Action.RETURN,	// [17] PrimitiveType = VOID
			Action.RETURN,	// [18] PrimitiveType = BOOLEAN
			Action.RETURN,	// [19] PrimitiveType = INT
			RETURN3,	// [20] ArrayType = ID LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [21] ArrayType = ArrayType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [22] ArrayType = PrimitiveType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [23] Parameter = TypeName ID; returns 'ID' although none is marked
			RETURN2,	// [24] ParameterList = Parameter ParameterY; returns 'ParameterY' although none is marked
			Action.NONE,  	// [25] ParameterList = 
			RETURN3,	// [26] ParameterY = COMMA Parameter ParameterY; returns 'ParameterY' although none is marked
			Action.NONE,  	// [27] ParameterY = 
			RETURN2,	// [28] Statements = Statement Statements; returns 'Statements' although none is marked
			Action.NONE,  	// [29] Statements = 
			Action.RETURN,	// [30] Statement = LocalVariableDeclaration
			Action.RETURN,	// [31] Statement = BlockStatement
			Action.RETURN,	// [32] Statement = IfStatement
			Action.RETURN,	// [33] Statement = WhileStatement
			Action.RETURN,	// [34] Statement = BreakStatement
			Action.RETURN,	// [35] Statement = ReturnStatement
			Action.RETURN,	// [36] Statement = ExpressionStatement
			RETURN3,	// [37] LocalVariableDeclaration = TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [38] BlockStatement = LCURLY Statements RCURLY; returns 'RCURLY' although none is marked
			RETURN5,	// [39] IfStatement = IF LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN7,	// [40] IfStatement = IF LPAREN Expression RPAREN Statement ELSE Statement; returns 'Statement' although none is marked
			RETURN5,	// [41] WhileStatement = WHILE LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN2,	// [42] BreakStatement = BREAK SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [43] ReturnStatement = RETURN SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [44] ReturnStatement = RETURN Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [45] ExpressionStatement = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [46] Expression = Assignment
			Action.RETURN,	// [47] Expression = RhsExpression
			RETURN3,	// [48] Assignment = LhsExpression EQL Expression; returns 'Expression' although none is marked
			RETURN2,	// [49] LhsExpression = ID LhsExpressionY; returns 'LhsExpressionY' although none is marked
			RETURN4,	// [50] LhsExpressionY = LBRACKET Expression RBRACKET LhsExpressionY; returns 'LhsExpressionY' although none is marked
			Action.NONE,  	// [51] LhsExpressionY = 
			Action.RETURN,	// [52] RhsExpression = ArithmeticExpression
			RETURN3,	// [53] RhsExpression = ArithmeticExpression ComparisonOperator ArithmeticExpression; returns 'ArithmeticExpression' although none is marked
			Action.RETURN,	// [54] ComparisonOperator = EQEQ
			Action.RETURN,	// [55] ComparisonOperator = NEQ
			Action.RETURN,	// [56] ComparisonOperator = LT
			Action.RETURN,	// [57] ComparisonOperator = LEQ
			Action.RETURN,	// [58] ComparisonOperator = GT
			Action.RETURN,	// [59] ComparisonOperator = GEQ
			RETURN2,	// [60] ArithmeticExpression = Term ArithmeticExpressionY; returns 'ArithmeticExpressionY' although none is marked
			RETURN3,	// [61] ArithmeticExpressionY = AdditiveOperator Term ArithmeticExpressionY; returns 'ArithmeticExpressionY' although none is marked
			Action.NONE,  	// [62] ArithmeticExpressionY = 
			Action.RETURN,	// [63] AdditiveOperator = PLUS
			Action.RETURN,	// [64] AdditiveOperator = MINUS
			RETURN2,	// [65] Term = Factor TermY; returns 'TermY' although none is marked
			RETURN3,	// [66] TermY = MultiplicativeOperator Factor TermY; returns 'TermY' although none is marked
			Action.NONE,  	// [67] TermY = 
			Action.RETURN,	// [68] MultiplicativeOperator = TIMES
			Action.RETURN,	// [69] MultiplicativeOperator = DIV
			Action.RETURN,	// [70] MultiplicativeOperator = MOD
			RETURN2,	// [71] Factor = MINUS Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [72] Factor = PrimaryFactor
			Action.RETURN,	// [73] PrimaryFactor = LhsExpression
			Action.RETURN,	// [74] PrimaryFactor = FunctionCall
			Action.RETURN,	// [75] PrimaryFactor = ArrayExpression
			Action.RETURN,	// [76] PrimaryFactor = STRING_LITERAL
			Action.RETURN,	// [77] PrimaryFactor = INT_LITERAL
			Action.RETURN,	// [78] PrimaryFactor = Boolean
			RETURN3,	// [79] PrimaryFactor = LPAREN Expression RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [80] Boolean = TRUE
			Action.RETURN,	// [81] Boolean = FALSE
			RETURN4,	// [82] FunctionCall = ID LPAREN ExpressionListEmpty RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [83] ExpressionListEmpty = ExpressionList
			Action.NONE,  	// [84] ExpressionListEmpty = 
			RETURN2,	// [85] ExpressionList = Expression ExpressionListY; returns 'ExpressionListY' although none is marked
			RETURN3,	// [86] ExpressionListY = COMMA Expression ExpressionListY; returns 'ExpressionListY' although none is marked
			Action.NONE,  	// [87] ExpressionListY = 
			RETURN3	// [88] ArrayExpression = LBRACKET ExpressionList RBRACKET; returns 'RBRACKET' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
