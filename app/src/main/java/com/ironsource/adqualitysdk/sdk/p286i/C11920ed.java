package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ed */
/* JADX INFO: loaded from: classes6.dex */
public final class C11920ed extends C11918eb {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28768 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static boolean f28769 = true;

    /* JADX INFO: renamed from: ﻏ */
    private static int f28770 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28771 = 5;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f28772 = {'x', 'z', AbstractJsonLexerKt.UNICODE_ESC, 'j', 'w', 'J', 't', '%', AbstractJsonLexerKt.END_OBJ, 'h', 'y', 'n', 's', 'l', 'r', 'm', 'i', '3', '-', '.', 'A', 'C'};

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f28773 = true;

    /* JADX INFO: renamed from: ﻐ */
    private AbstractC11919ec[] f28774;

    /* JADX INFO: renamed from: ﾒ */
    private AbstractC11919ec f28775;

    public C11920ed(AbstractC11919ec abstractC11919ec, String str, List<AbstractC11919ec> list, List<AbstractC11919ec> list2, C11904do c11904do) {
        super(str, list2, c11904do);
        this.f28775 = abstractC11919ec;
        if (list != null) {
            AbstractC11919ec[] abstractC11919ecArr = new AbstractC11919ec[list.size()];
            this.f28774 = abstractC11919ecArr;
            list.toArray(abstractC11919ecArr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11918eb, com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        Method methodM30829;
        List<Object> list = m30148(c11907dr, c11877co);
        AbstractC11919ec abstractC11919ec = this.f28775;
        if ((abstractC11919ec instanceof C11931eo) && ((C11931eo) abstractC11919ec).m30179().equals(m30159(null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0085\u0084\u0083\u0082\u0081").intern())) {
            return c11877co.m29679().m30350().m30354(m30151()).m30048(c11907dr, c11877co, list).m30061(false);
        }
        Object objM30066 = this.f28775.m30156(c11907dr, c11877co).m30066();
        if (objM30066 instanceof InterfaceC11870ch) {
            return new C11908ds(((InterfaceC11870ch) objM30066).mo28830(m30151(), list, c11877co.m29665()));
        }
        if (objM30066 instanceof InterfaceC11871ci) {
            String str = m30151();
            c11877co.m29665();
            return new C11908ds(((InterfaceC11871ci) objM30066).mo29560(c11877co, str, list, c11907dr));
        }
        if (objM30066 instanceof C11877co) {
            synchronized (objM30066) {
                C11877co c11877co2 = (C11877co) objM30066;
                C11906dq c11906dqM29678 = c11877co2.m29678(m30151());
                if (c11906dqM29678 != null) {
                    return c11906dqM29678.m30048(c11877co2.m29669(), c11877co2, list).m30061(false);
                }
                String strM29666 = c11877co.m29666();
                StringBuilder sb = new StringBuilder();
                sb.append(m30159(null, 127 - Color.green(0), null, "\u0088\u0091\u0087\u0090\u008b\u0084\u008f\u0088\u008e\u008d\u008c\u008b\u0082\u008a\u0084\u0089\u0084\u0088\u0085\u0087\u0085\u0085\u0086").intern());
                sb.append(m30151());
                C11875cm.m29607(strM29666, sb.toString(), new NoSuchMethodException());
            }
        }
        try {
            AbstractC11919ec[] abstractC11919ecArr = this.f28774;
            if (abstractC11919ecArr != null) {
                methodM30829 = C12079ka.m30820(objM30066, m30151(), m30157(abstractC11919ecArr, c11907dr, c11877co));
            } else {
                methodM30829 = C12079ka.m30829(objM30066, m30151(), list);
            }
            if (methodM30829 == null) {
                list.add(0, objM30066);
                C11891db c11891dbM29668 = c11877co.m29668();
                String str2 = m30151();
                c11877co.m29665();
                return new C11908ds(c11891dbM29668.mo29560(c11877co, str2, list, c11907dr));
            }
            return new C11908ds(methodM30829.invoke(objM30066, list.toArray()));
        } catch (IllegalAccessException e) {
            String strM29667 = c11877co.m29666();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m30159(null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, "\u0088\u0091\u0087\u0090\u008b\u0084\u008f\u0088\u008e\u008d\u008c\u008b\u0082\u008a\u0084\u0089\u0084\u0088\u0085\u0087\u0085\u0085\u0086").intern());
            sb2.append(this);
            C11875cm.m29607(strM29667, sb2.toString(), e);
            return null;
        } catch (IllegalArgumentException e2) {
            String strM29668 = c11877co.m29666();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m30159(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0088\u0091\u0087\u0090\u008b\u0084\u008f\u0088\u008e\u008d\u008c\u008b\u0082\u008a\u0084\u0089\u0084\u0088\u0085\u0087\u0085\u0085\u0086").intern());
            sb3.append(this);
            C11875cm.m29607(strM29668, sb3.toString(), e2);
            return null;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static List<Class> m30157(AbstractC11919ec[] abstractC11919ecArr, C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = abstractC11919ecArr.length;
        int i2 = f28768 + 81;
        f28770 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f28770 + 57;
            f28768 = i5 % 128;
            if (i5 % 2 != 0) {
                arrayList.add((Class) abstractC11919ecArr[i4].m30156(c11907dr, c11877co).m30066());
                i4 += 113;
            } else {
                arrayList.add((Class) abstractC11919ecArr[i4].m30156(c11907dr, c11877co).m30066());
                i4++;
            }
        }
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11918eb
    public final String toString() {
        int i = 2 % 2;
        int i2 = f28770 + 97;
        f28768 = i2 % 128;
        int i3 = i2 % 2;
        String strMo30149 = mo30149(m30150());
        int i4 = f28768 + 45;
        f28770 = i4 % 128;
        if (i4 % 2 != 0) {
            return strMo30149;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11918eb
    /* JADX INFO: renamed from: ｋ */
    final String mo30149(Object[] objArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28775);
        sb.append(m30159(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0092").intern());
        sb.append(m30151());
        sb.append(m30158());
        sb.append(m30159(null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), null, "\u0093").intern());
        sb.append(m30152(objArr));
        sb.append(m30159(null, Color.blue(0) + 127, null, "\u0094").intern());
        String string = sb.toString();
        int i2 = f28770 + 31;
        f28768 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾇ */
    private String m30158() {
        int i = 2 % 2;
        if (this.f28774 == null) {
            int i2 = f28768 + 65;
            f28770 = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m30159(null, Color.rgb(0, 0, 0) + 16777343, null, "\u0095").intern());
        sb.append(m30152(this.f28774));
        sb.append(m30159(null, 127 - KeyEvent.getDeadChar(0, 0), null, "\u0096").intern());
        String string = sb.toString();
        int i4 = f28768 + 55;
        f28770 = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6.f28775 != null) goto L22;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11918eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11920ed.f28768
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11920ed.f28770 = r2
            int r1 = r1 % r0
            r1 = 1
            if (r5 != r6) goto L10
            return r1
        L10:
            r2 = 0
            if (r6 == 0) goto L54
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r4 = r6.getClass()
            if (r3 == r4) goto L1e
            goto L54
        L1e:
            boolean r3 = super.equals(r6)
            if (r3 != 0) goto L25
            return r2
        L25:
            com.ironsource.adqualitysdk.sdk.i.ed r6 = (com.ironsource.adqualitysdk.sdk.p286i.C11920ed) r6
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r5.f28775
            if (r3 == 0) goto L41
            com.ironsource.adqualitysdk.sdk.i.ec r4 = r6.f28775
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L46
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C11920ed.f28770
            int r6 = r6 + 119
            int r1 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11920ed.f28768 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L45
            int r0 = r0 % 4
            goto L45
        L41:
            com.ironsource.adqualitysdk.sdk.i.ec r0 = r6.f28775
            if (r0 == 0) goto L46
        L45:
            return r2
        L46:
            com.ironsource.adqualitysdk.sdk.i.ec[] r0 = r5.f28774
            com.ironsource.adqualitysdk.sdk.i.ec[] r6 = r6.f28774
            if (r0 == 0) goto L51
            boolean r6 = r0.equals(r6)
            return r6
        L51:
            if (r6 != 0) goto L54
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11920ed.equals(java.lang.Object):boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11918eb
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28770 + 55;
        f28768 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = super.hashCode() * 31;
        AbstractC11919ec abstractC11919ec = this.f28775;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (abstractC11919ec != null ? abstractC11919ec.hashCode() : 0)) * 31;
        AbstractC11919ec[] abstractC11919ecArr = this.f28774;
        if (abstractC11919ecArr != null) {
            int i4 = f28770 + 73;
            f28768 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = abstractC11919ecArr.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30159(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f28772;
            int i2 = f28771;
            if (f28769) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f28773) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
