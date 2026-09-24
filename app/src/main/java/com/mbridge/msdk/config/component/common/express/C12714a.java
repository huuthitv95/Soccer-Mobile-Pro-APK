package com.mbridge.msdk.config.component.common.express;

import androidx.webkit.ProxyConfig;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.node.AbstractC12723d;
import com.mbridge.msdk.config.component.common.express.node.C12720a;
import com.mbridge.msdk.config.component.common.express.node.C12721b;
import com.mbridge.msdk.config.component.common.express.node.C12722c;
import com.mbridge.msdk.config.component.common.express.node.C12724e;
import com.mbridge.msdk.config.component.common.express.node.C12725f;
import com.mbridge.msdk.config.component.common.express.node.C12726g;
import com.mbridge.msdk.config.component.common.express.node.C12727h;
import com.mbridge.msdk.config.component.common.express.node.C12728i;
import com.mbridge.msdk.config.component.common.express.node.C12729j;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.a */
/* JADX INFO: compiled from: ExpressionASTParser.java */
/* JADX INFO: loaded from: classes5.dex */
class C12714a {

    /* JADX INFO: renamed from: a */
    private Map<String, Integer> f33832a = UByte$$ExternalSyntheticBackport0.m43496m(new Map.Entry[]{UByte$$ExternalSyntheticBackport0.m43495m((Object) C11744X3.j.f26434b, (Object) 0), UByte$$ExternalSyntheticBackport0.m43495m((Object) "+=", (Object) 0), UByte$$ExternalSyntheticBackport0.m43495m((Object) "-=", (Object) 0), UByte$$ExternalSyntheticBackport0.m43495m((Object) "*=", (Object) 0), UByte$$ExternalSyntheticBackport0.m43495m((Object) "/=", (Object) 0), UByte$$ExternalSyntheticBackport0.m43495m((Object) "%=", (Object) 0), UByte$$ExternalSyntheticBackport0.m43495m((Object) C12770c.m35209b("883"), (Object) 1), UByte$$ExternalSyntheticBackport0.m43495m((Object) C12770c.m35209b("882"), (Object) 2), UByte$$ExternalSyntheticBackport0.m43495m((Object) "==", (Object) 3), UByte$$ExternalSyntheticBackport0.m43495m((Object) "!=", (Object) 3), UByte$$ExternalSyntheticBackport0.m43495m((Object) ">", (Object) 4), UByte$$ExternalSyntheticBackport0.m43495m((Object) "<", (Object) 4), UByte$$ExternalSyntheticBackport0.m43495m((Object) ">=", (Object) 4), UByte$$ExternalSyntheticBackport0.m43495m((Object) "<=", (Object) 4), UByte$$ExternalSyntheticBackport0.m43495m((Object) ScarConstants.IN_SIGNAL_KEY, (Object) 4), UByte$$ExternalSyntheticBackport0.m43495m((Object) "IN", (Object) 4), UByte$$ExternalSyntheticBackport0.m43495m((Object) "+", (Object) 5), UByte$$ExternalSyntheticBackport0.m43495m((Object) "-", (Object) 5), UByte$$ExternalSyntheticBackport0.m43495m((Object) ProxyConfig.MATCH_ALL_SCHEMES, (Object) 6), UByte$$ExternalSyntheticBackport0.m43495m((Object) RemoteSettings.FORWARD_SLASH_STRING, (Object) 6), UByte$$ExternalSyntheticBackport0.m43495m((Object) "%", (Object) 6)});

    /* JADX INFO: renamed from: b */
    private List<String> f33833b;

    /* JADX INFO: renamed from: c */
    private int f33834c;

    /* JADX INFO: renamed from: b */
    private List<String> m34877b(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\"') {
                sb.append(cCharAt);
                z = !z;
            } else if (z) {
                sb.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i = i2 + 1) < length && str.charAt(i) == '=') {
                    arrayList.add(cCharAt + C11744X3.j.f26434b);
                    i2 = i;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private AbstractC12723d m34878c(AbstractC12723d abstractC12723d, boolean z) {
        if (!this.f33833b.get(this.f33834c).equals("(")) {
            return m34875a(abstractC12723d, z);
        }
        this.f33834c++;
        AbstractC12723d abstractC12723dM34876b = m34876b(abstractC12723d, true);
        int i = this.f33834c + 1;
        this.f33834c = i;
        return i > this.f33833b.size() - 1 ? abstractC12723dM34876b : m34876b(abstractC12723dM34876b, false);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC12723d m34879a(String str) {
        this.f33833b = m34877b(str);
        this.f33834c = 0;
        return m34876b(null, false);
    }

    /* JADX INFO: renamed from: a */
    private AbstractC12723d m34874a(AbstractC12723d abstractC12723d, int i, boolean z) {
        String str;
        Integer num;
        AbstractC12723d c12722c;
        AbstractC12723d abstractC12723dM34878c = m34878c(abstractC12723d, z);
        while (this.f33834c < this.f33833b.size() && (num = this.f33832a.get((str = this.f33833b.get(this.f33834c)))) != null && num.intValue() >= i) {
            int i2 = this.f33834c + 1;
            this.f33834c = i2;
            if (i2 > this.f33833b.size() - 1) {
                break;
            }
            AbstractC12723d abstractC12723dM34874a = m34874a(abstractC12723d, num.intValue() + 1, z);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                c12722c = new C12721b(str, abstractC12723dM34878c, abstractC12723dM34874a);
            } else {
                c12722c = new C12722c(str, abstractC12723dM34878c, abstractC12723dM34874a);
            }
            abstractC12723dM34878c = c12722c;
        }
        return abstractC12723dM34878c;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC12723d m34875a(AbstractC12723d abstractC12723d, boolean z) {
        AbstractC12723d c12729j;
        C12724e c12724e;
        AbstractC12723d c12720a;
        int i;
        if (abstractC12723d == null) {
            List<String> list = this.f33833b;
            int i2 = this.f33834c;
            this.f33834c = i2 + 1;
            abstractC12723d = new C12728i(list.get(i2));
        }
        int i3 = this.f33834c;
        while (this.f33834c < this.f33833b.size()) {
            boolean z2 = true;
            String str = "";
            if (this.f33833b.get(this.f33834c - 1).startsWith("$") && this.f33834c >= i3) {
                while (true) {
                    if (this.f33834c - 1 < this.f33833b.size()) {
                        String str2 = this.f33833b.get(this.f33834c - 1);
                        if (this.f33834c != this.f33833b.size() && (this.f33834c >= this.f33833b.size() || ("!><".indexOf(this.f33833b.get(this.f33834c).charAt(0)) < 0 && !this.f33833b.get(this.f33834c).equals(C12770c.m35209b("883")) && !this.f33833b.get(this.f33834c).equals(C12770c.m35209b("882")) && !this.f33833b.get(this.f33834c).equals("IN")))) {
                            String str3 = this.f33833b.get(this.f33834c);
                            if (this.f33832a.containsKey(this.f33833b.get(this.f33834c)) || RemoteSettings.FORWARD_SLASH_STRING.indexOf(str3.charAt(0)) == 0) {
                                break;
                            }
                            if ("{[(.".indexOf(str3.charAt(0)) >= 0) {
                                this.f33834c = i3;
                                i3++;
                            } else {
                                str = str + str2;
                                this.f33834c++;
                            }
                        } else {
                            abstractC12723d = new C12728i(str + str2);
                            break;
                        }
                    }
                    z2 = false;
                    break;
                }
                if (z2) {
                    this.f33834c = i3;
                    return abstractC12723d;
                }
            } else if (this.f33833b.get(this.f33834c).equals(".")) {
                i3 = this.f33834c;
                List<String> list2 = this.f33833b;
                this.f33834c = i3 + 2;
                String str4 = list2.get(i3 + 1);
                if (this.f33834c < this.f33833b.size() && this.f33833b.get(this.f33834c).equals("(")) {
                    this.f33834c++;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 1;
                    while (this.f33834c < this.f33833b.size() && i4 > 0) {
                        String str5 = this.f33833b.get(this.f33834c);
                        if (str5.equals("(")) {
                            i4++;
                        } else if (str5.equals(")")) {
                            i4--;
                        }
                        if (i4 > 0) {
                            if (str5.equals(",") && i4 == 1) {
                                arrayList.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList2)));
                                arrayList2.clear();
                            } else {
                                arrayList2.add(str5);
                            }
                        }
                        this.f33834c++;
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList2)));
                    }
                    c12724e = new C12724e(abstractC12723d, str4, arrayList);
                    abstractC12723d = c12724e;
                } else {
                    c12729j = new C12729j(abstractC12723d, str4);
                    abstractC12723d = c12729j;
                }
            } else if (!this.f33833b.get(this.f33834c - 1).equals(C11744X3.j.f26438d) && !this.f33833b.get(this.f33834c).equals(C11744X3.j.f26438d)) {
                if (!this.f33833b.get(this.f33834c - 1).equals("{") && !this.f33833b.get(this.f33834c).equals("{")) {
                    if (this.f33833b.get(this.f33834c).equals(CertificateUtil.DELIMITER)) {
                        i3 = this.f33834c;
                        String str6 = this.f33833b.get(i3 - 1);
                        int i5 = this.f33834c;
                        List<String> list3 = this.f33833b;
                        this.f33834c = i5 + 2;
                        c12729j = new C12726g(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) " ", new CharSequence[]{str6})), new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) " ", new CharSequence[]{list3.get(i5 + 1)})));
                        abstractC12723d = c12729j;
                    } else {
                        i3 = this.f33834c;
                        String str7 = this.f33833b.get(i3 - 1);
                        if (this.f33834c < this.f33833b.size() && this.f33833b.get(this.f33834c).equals("(")) {
                            C12728i c12728i = new C12728i("");
                            this.f33834c++;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            int i6 = 1;
                            while (this.f33834c < this.f33833b.size() && i6 > 0) {
                                String str8 = this.f33833b.get(this.f33834c);
                                if (str8.equals("(")) {
                                    i6++;
                                } else if (str8.equals(")")) {
                                    i6--;
                                }
                                if (i6 > 0) {
                                    if (str8.equals(",") && i6 == 1) {
                                        arrayList3.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList4)));
                                        arrayList4.clear();
                                    } else {
                                        arrayList4.add(str8);
                                    }
                                }
                                this.f33834c++;
                            }
                            if (!arrayList4.isEmpty()) {
                                arrayList3.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList4)));
                            }
                            c12724e = new C12724e(c12728i, str7, arrayList3);
                            abstractC12723d = c12724e;
                        } else {
                            if (this.f33834c >= this.f33833b.size() || this.f33832a.containsKey(this.f33833b.get(this.f33834c)) || RemoteSettings.FORWARD_SLASH_STRING.indexOf(str7.charAt(0)) == 0 || (z && ")".indexOf(this.f33833b.get(this.f33834c).charAt(0)) >= 0)) {
                                break;
                            }
                            this.f33834c++;
                        }
                    }
                } else {
                    if (this.f33833b.get(this.f33834c).equals("{")) {
                        int i7 = this.f33834c;
                        this.f33834c = i7 + 1;
                        i3 = i7;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int i8 = 1;
                    while (this.f33834c < this.f33833b.size() && i8 > 0) {
                        String str9 = this.f33833b.get(this.f33834c);
                        if (str9.equals("{")) {
                            i8++;
                        } else if (str9.equals("}")) {
                            i8--;
                        }
                        if (i8 > 0) {
                            if (str9.equals(",") && i8 == 1) {
                                arrayList5.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList6)));
                                arrayList6.clear();
                            } else {
                                arrayList6.add(str9);
                            }
                        }
                        this.f33834c++;
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList5.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList6)));
                    }
                    c12720a = new C12727h(arrayList5);
                    abstractC12723d = c12720a;
                }
            } else {
                if (this.f33833b.get(this.f33834c).equals(C11744X3.j.f26438d)) {
                    i3 = this.f33834c;
                    this.f33834c = i3 + 1;
                }
                if (this.f33834c < this.f33833b.size() && this.f33833b.get(this.f33834c).equals("?")) {
                    this.f33834c++;
                    ArrayList arrayList7 = new ArrayList();
                    int i9 = 1;
                    while (this.f33834c < this.f33833b.size() && i9 > 0) {
                        String str10 = this.f33833b.get(this.f33834c);
                        if (str10.equals(C11744X3.j.f26438d)) {
                            i9++;
                        } else if (str10.equals(C11744X3.j.f26440e)) {
                            i9--;
                        }
                        if (i9 > 0) {
                            arrayList7.add(str10);
                        }
                        this.f33834c++;
                    }
                    AbstractC12723d abstractC12723dM34879a = new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList7));
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(abstractC12723dM34879a);
                    c12720a = new C12724e(abstractC12723d, C12770c.m35209b("877"), arrayList8);
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    int i10 = this.f33834c;
                    int i11 = i10 - 2;
                    if (i11 >= 0 && ((i10 <= 2 || !this.f33833b.get(i11).equals("(")) && ((i = this.f33834c) <= 2 || !this.f33832a.containsKey(this.f33833b.get(i - 2))))) {
                        int i12 = 1;
                        while (this.f33834c < this.f33833b.size() && i12 > 0) {
                            String str11 = this.f33833b.get(this.f33834c);
                            if (str11.equals(C11744X3.j.f26438d)) {
                                i12++;
                            } else if (str11.equals(C11744X3.j.f26440e)) {
                                i12--;
                            }
                            if (i12 > 0) {
                                arrayList9.add(str11);
                            }
                            this.f33834c++;
                        }
                        c12729j = new C12725f(abstractC12723d, new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList9)));
                        abstractC12723d = c12729j;
                    } else {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        int i13 = 1;
                        while (this.f33834c < this.f33833b.size() && i13 > 0) {
                            String str12 = this.f33833b.get(this.f33834c);
                            if (str12.equals(C11744X3.j.f26438d)) {
                                i13++;
                            } else if (str12.equals(C11744X3.j.f26440e)) {
                                i13--;
                            }
                            if (i13 > 0) {
                                if (str12.equals(",") && i13 == 1) {
                                    arrayList10.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList11)));
                                    arrayList11.clear();
                                } else {
                                    arrayList11.add(str12);
                                }
                            }
                            this.f33834c++;
                        }
                        if (!arrayList11.isEmpty()) {
                            arrayList10.add(new C12714a().m34879a(UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) " ", (Iterable) arrayList11)));
                        }
                        c12720a = new C12720a(arrayList10);
                    }
                }
                abstractC12723d = c12720a;
            }
        }
        return abstractC12723d;
    }

    /* JADX INFO: renamed from: b */
    private AbstractC12723d m34876b(AbstractC12723d abstractC12723d, boolean z) {
        return m34874a(abstractC12723d, 0, z);
    }
}
