package com.vmware.in.testframework.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestFrameworkLexer extends Lexer {
    public static final int T__19=19;
    public static final int RULE_ID=7;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_SPACE=4;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators

    public InternalTestFrameworkLexer() {;} 
    public InternalTestFrameworkLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTestFrameworkLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:11:7: ( 'Testcase' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:11:9: 'Testcase'
            {
            match("Testcase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:12:7: ( '=' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:13:7: ( 'Summary' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:13:9: 'Summary'
            {
            match("Summary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:14:7: ( 'Table' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:14:9: 'Table'
            {
            match("Table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:15:7: ( '{' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:16:7: ( '}' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:17:7: ( 'identifier' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:17:9: 'identifier'
            {
            match("identifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:18:7: ( 'label' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:18:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:19:7: ( 'Checktable' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:19:9: 'Checktable'
            {
            match("Checktable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1275:12: ( ( ' ' )* )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1275:14: ( ' ' )*
            {
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1275:14: ( ' ' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1275:14: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1277:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1277:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1277:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1277:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1277:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1279:10: ( ( '0' .. '9' )+ )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1279:12: ( '0' .. '9' )+
            {
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1279:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1279:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1281:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1283:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1283:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1283:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1283:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:41: ( '\\r' )? '\\n'
                    {
                    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1285:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1287:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1287:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1287:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1289:16: ( . )
            // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1289:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_SPACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=17;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:64: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 11 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:75: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:83: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:92: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:104: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:120: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:136: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../com.vmware.in.testframework.ui/src-gen/com/vmware/in/testframework/ui/contentassist/antlr/internal/InternalTestFramework.g:1:144: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\12\1\25\1\uffff\1\25\2\uffff\3\25\1\12\1\uffff\1\22\2\uffff"+
        "\3\22\2\uffff\2\25\2\uffff\1\25\2\uffff\3\25\1\12\5\uffff\15\25"+
        "\1\66\2\25\1\71\2\25\1\uffff\2\25\1\uffff\2\25\1\100\2\25\1\103"+
        "\1\uffff\2\25\1\uffff\2\25\1\110\1\111\2\uffff";
    static final String DFA13_eofS =
        "\112\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\uffff\1\165\2\uffff\1\144\1\141\1\150\1\11\1\uffff"+
        "\1\101\2\uffff\2\0\1\52\2\uffff\1\163\1\142\2\uffff\1\155\2\uffff"+
        "\1\145\1\142\1\145\1\11\5\uffff\1\164\1\154\1\155\1\156\1\145\2"+
        "\143\1\145\1\141\1\164\1\154\1\153\1\141\1\60\1\162\1\151\1\60\1"+
        "\164\1\163\1\uffff\1\171\1\146\1\uffff\1\141\1\145\1\60\1\151\1"+
        "\142\1\60\1\uffff\1\145\1\154\1\uffff\1\162\1\145\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\1\uffff\1\165\2\uffff\1\144\1\141\1\150\1\40\1\uffff"+
        "\1\172\2\uffff\2\uffff\1\57\2\uffff\1\163\1\142\2\uffff\1\155\2"+
        "\uffff\1\145\1\142\1\145\1\40\5\uffff\1\164\1\154\1\155\1\156\1"+
        "\145\2\143\1\145\1\141\1\164\1\154\1\153\1\141\1\172\1\162\1\151"+
        "\1\172\1\164\1\163\1\uffff\1\171\1\146\1\uffff\1\141\1\145\1\172"+
        "\1\151\1\142\1\172\1\uffff\1\145\1\154\1\uffff\1\162\1\145\2\172"+
        "\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\6\4\uffff\1\12\1\uffff\1\13\1\14\3\uffff"+
        "\1\20\1\21\2\uffff\1\13\1\2\1\uffff\1\5\1\6\4\uffff\1\20\1\14\1"+
        "\15\1\16\1\17\23\uffff\1\4\2\uffff\1\10\6\uffff\1\3\2\uffff\1\1"+
        "\4\uffff\1\7\1\11";
    static final String DFA13_specialS =
        "\1\1\15\uffff\1\0\1\2\72\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\11\1\22\1\16\4\22\1\17\7\22\1"+
            "\20\12\15\3\22\1\2\3\22\2\14\1\10\17\14\1\3\1\1\6\14\3\22\1"+
            "\13\1\14\1\22\10\14\1\6\2\14\1\7\16\14\1\4\1\22\1\5\uff82\22",
            "\1\24\3\uffff\1\23",
            "",
            "\1\27",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\2\36\2\uffff\1\36\22\uffff\1\35",
            "",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\0\40",
            "\0\40",
            "\1\41\4\uffff\1\42",
            "",
            "",
            "\1\43",
            "\1\44",
            "",
            "",
            "\1\45",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\2\36\2\uffff\1\36\22\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\67",
            "\1\70",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\101",
            "\1\102",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_SPACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_14 = input.LA(1);

                        s = -1;
                        if ( ((LA13_14>='\u0000' && LA13_14<='\uFFFF')) ) {s = 32;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='T') ) {s = 1;}

                        else if ( (LA13_0=='=') ) {s = 2;}

                        else if ( (LA13_0=='S') ) {s = 3;}

                        else if ( (LA13_0=='{') ) {s = 4;}

                        else if ( (LA13_0=='}') ) {s = 5;}

                        else if ( (LA13_0=='i') ) {s = 6;}

                        else if ( (LA13_0=='l') ) {s = 7;}

                        else if ( (LA13_0=='C') ) {s = 8;}

                        else if ( (LA13_0==' ') ) {s = 9;}

                        else if ( (LA13_0=='^') ) {s = 11;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='D' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='z')) ) {s = 12;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 13;}

                        else if ( (LA13_0=='\"') ) {s = 14;}

                        else if ( (LA13_0=='\'') ) {s = 15;}

                        else if ( (LA13_0=='/') ) {s = 16;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r') ) {s = 17;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 18;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_15 = input.LA(1);

                        s = -1;
                        if ( ((LA13_15>='\u0000' && LA13_15<='\uFFFF')) ) {s = 32;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}