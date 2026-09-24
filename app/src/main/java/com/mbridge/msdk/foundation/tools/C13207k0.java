package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.k0 */
/* JADX INFO: compiled from: SameBase64Tool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13207k0 {

    /* JADX INFO: renamed from: a */
    private static Map<Character, Character> f36314a;

    /* JADX INFO: renamed from: b */
    private static Map<Character, Character> f36315b;

    /* JADX INFO: renamed from: c */
    private static byte[] f36316c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.f22503VT, Ascii.f22492FF, Ascii.f22490CR, Ascii.f22500SO, Ascii.f22499SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f22491EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.f22493FS, Ascii.f22494GS, Ascii.f22498RS, Ascii.f22502US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d */
    private static char[] f36317d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f36314a = map;
        map.put('v', 'A');
        f36314a.put('S', 'B');
        f36314a.put('o', 'C');
        f36314a.put('a', 'D');
        f36314a.put('j', 'E');
        f36314a.put('c', 'F');
        f36314a.put('7', 'G');
        f36314a.put('d', 'H');
        f36314a.put('R', 'I');
        f36314a.put('z', 'J');
        f36314a.put('p', 'K');
        f36314a.put('W', 'L');
        f36314a.put('i', 'M');
        f36314a.put('f', 'N');
        f36314a.put('G', 'O');
        f36314a.put('y', 'P');
        f36314a.put('N', 'Q');
        f36314a.put('x', 'R');
        f36314a.put('Z', 'S');
        f36314a.put('n', 'T');
        f36314a.put('V', 'U');
        f36314a.put('5', 'V');
        f36314a.put('k', 'W');
        f36314a.put('+', 'X');
        f36314a.put('D', 'Y');
        f36314a.put('H', 'Z');
        f36314a.put('L', 'a');
        f36314a.put('Y', 'b');
        f36314a.put('h', 'c');
        f36314a.put('J', 'd');
        f36314a.put('4', 'e');
        f36314a.put('6', 'f');
        f36314a.put('l', 'g');
        f36314a.put('t', 'h');
        f36314a.put('0', 'i');
        f36314a.put('U', 'j');
        f36314a.put('3', 'k');
        f36314a.put('Q', 'l');
        f36314a.put('r', 'm');
        f36314a.put('g', 'n');
        f36314a.put('E', 'o');
        f36314a.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        f36314a.put('q', 'q');
        f36314a.put('8', 'r');
        f36314a.put('s', 's');
        f36314a.put('w', 't');
        f36314a.put('/', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f36314a.put('X', 'v');
        f36314a.put('M', 'w');
        f36314a.put('e', 'x');
        f36314a.put('B', 'y');
        f36314a.put('A', 'z');
        f36314a.put('T', '0');
        f36314a.put('2', '1');
        f36314a.put('F', '2');
        f36314a.put('b', '3');
        f36314a.put('9', '4');
        f36314a.put('P', '5');
        f36314a.put('1', '6');
        f36314a.put('O', '7');
        f36314a.put('I', '8');
        f36314a.put('K', '9');
        f36314a.put('m', '+');
        f36314a.put('C', '/');
        HashMap map2 = new HashMap();
        f36315b = map2;
        map2.put('A', 'v');
        f36315b.put('B', 'S');
        f36315b.put('C', 'o');
        f36315b.put('D', 'a');
        f36315b.put('E', 'j');
        f36315b.put('F', 'c');
        f36315b.put('G', '7');
        f36315b.put('H', 'd');
        f36315b.put('I', 'R');
        f36315b.put('J', 'z');
        f36315b.put('K', 'p');
        f36315b.put('L', 'W');
        f36315b.put('M', 'i');
        f36315b.put('N', 'f');
        f36315b.put('O', 'G');
        f36315b.put('P', 'y');
        f36315b.put('Q', 'N');
        f36315b.put('R', 'x');
        f36315b.put('S', 'Z');
        f36315b.put('T', 'n');
        f36315b.put('U', 'V');
        f36315b.put('V', '5');
        f36315b.put('W', 'k');
        f36315b.put('X', '+');
        f36315b.put('Y', 'D');
        f36315b.put('Z', 'H');
        f36315b.put('a', 'L');
        f36315b.put('b', 'Y');
        f36315b.put('c', 'h');
        f36315b.put('d', 'J');
        f36315b.put('e', '4');
        f36315b.put('f', '6');
        f36315b.put('g', 'l');
        f36315b.put('h', 't');
        f36315b.put('i', '0');
        f36315b.put('j', 'U');
        f36315b.put('k', '3');
        f36315b.put('l', 'Q');
        f36315b.put('m', 'r');
        f36315b.put('n', 'g');
        f36315b.put('o', 'E');
        f36315b.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f36315b.put('q', 'q');
        f36315b.put('r', '8');
        f36315b.put('s', 's');
        f36315b.put('t', 'w');
        f36315b.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        f36315b.put('v', 'X');
        f36315b.put('w', 'M');
        f36315b.put('x', 'e');
        f36315b.put('y', 'B');
        f36315b.put('z', 'A');
        f36315b.put('0', 'T');
        f36315b.put('1', '2');
        f36315b.put('2', 'F');
        f36315b.put('3', 'b');
        f36315b.put('4', '9');
        f36315b.put('5', 'P');
        f36315b.put('6', '1');
        f36315b.put('7', 'O');
        f36315b.put('8', 'I');
        f36315b.put('9', 'K');
        f36315b.put('+', 'm');
        f36315b.put('/', 'C');
    }

    /* JADX INFO: renamed from: a */
    public static String m37712a(String str) {
        return C13221r0.m37825b(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m37713b(String str) {
        return TextUtils.isEmpty(str) ? "" : C13221r0.m37826c(str);
    }
}
