package com.bytedance.sdk.openadsdk.core.p190aw.p193ri.p194ri;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3092ik;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.C3103qt;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3096ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.AbstractC3105lr;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3107fi extends AbstractC3105lr {
    public static final String xha = null;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi$ri */
    static class ri {

        /* JADX INFO: renamed from: ik */
        C3096ri.lr f9883ik;

        /* JADX INFO: renamed from: ka */
        String f9884ka;

        /* JADX INFO: renamed from: lr */
        C3096ri.ri f9885lr;

        /* JADX INFO: renamed from: ri */
        String f9886ri;

        /* JADX INFO: renamed from: fi */
        final List<C3099ik> f9882fi = new ArrayList();

        /* JADX INFO: renamed from: di */
        final List<C3099ik> f9881di = new ArrayList();
        float xha = Float.MIN_VALUE;

        public ri() {
        }

        public ri(String str, C3096ri.ri riVar, C3096ri.lr lrVar) {
            m12573ri(str, riVar, lrVar);
        }

        /* JADX INFO: renamed from: lr */
        public void m12571lr(String str) {
            this.f9881di.add(new C3099ik.ri(str).m12510ri());
        }

        /* JADX INFO: renamed from: ri */
        public void m12572ri(String str) {
            this.f9882fi.add(new C3099ik.ri(str).m12510ri());
        }

        /* JADX INFO: renamed from: ri */
        public void m12573ri(String str, C3096ri.ri riVar, C3096ri.lr lrVar) {
            this.f9886ri = str;
            this.f9885lr = riVar;
            this.f9883ik = lrVar;
        }
    }

    public C3107fi(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX INFO: renamed from: ik */
    private void m12560ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3099ik.m12502ri(C3099ik.m12498ri((wjv) null, (List<C3099ik>) Collections.singletonList(new C3099ik.ri(str).m12510ri()), this.f9870ri > 0 ? EnumC3106ri.NO_ADS_VAST_RESPONSE : EnumC3106ri.UNDEFINED_ERROR, -1L, (String) null, (String) null), (C3099ik.lr) null);
    }

    /* JADX INFO: renamed from: lr */
    public static int m12561lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.aw.ri] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX INFO: renamed from: lr */
    private C3104ri m12562lr(XmlPullParser xmlPullParser, List<C3099ik> list) throws Throwable {
        ?? r16;
        ?? r4 = 0;
        if (this.f9870ri >= 5) {
            m12569ri(xmlPullParser);
            return null;
        }
        C3097ka c3097ka = new C3097ka();
        String str = null;
        C3092ik c3092ikM12585ri = null;
        Set<C3103qt> setM12582ri = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                C3104ri c3104riMo12555ri = mo12555ri(str, r4, list);
                if (c3104riMo12555ri != null) {
                    if (c3104riMo12555ri.m12537ik() == null) {
                        c3104riMo12555ri.m12549ri(c3092ikM12585ri);
                    }
                    c3104riMo12555ri.m12546ri().m12483ri(c3097ka);
                    if (setM12582ri != null) {
                        c3104riMo12555ri.m12553ri(setM12582ri);
                    }
                }
                return c3104riMo12555ri;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                r16 = r4;
                switch (name) {
                    case "VASTAdTagURI":
                        String strRi = m12556ri(m12563lr(xmlPullParser, "VASTAdTagURI"), list);
                        if (!TextUtils.isEmpty(strRi)) {
                            str = strRi;
                            continue;
                            break;
                        } else {
                            m12570ri(xmlPullParser, "Wrapper", 3);
                            this.f9866fi = -2;
                            return r16;
                        }
                        break;
                    case "Error":
                        list.add(new C3099ik.ri(m12563lr(xmlPullParser, "Error")).m12510ri());
                        continue;
                        break;
                    case "Extensions":
                        break;
                    case "TrackingEvents":
                        C3108ik.m12579ri(xmlPullParser, c3097ka);
                        continue;
                        break;
                    case "CompanionAds":
                        c3092ikM12585ri = C3111ri.m12585ri(this.f9869lr, xmlPullParser);
                        continue;
                        break;
                    case "ClickTracking":
                        c3097ka.xha(m12566ri(xmlPullParser, "ClickTracking"));
                        continue;
                        break;
                    case "Impression":
                        c3097ka.m12488ri(m12566ri(xmlPullParser, name));
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            setM12582ri = C3109ka.m12582ri(xmlPullParser);
                        }
                    }
                }
            } else {
                r16 = r4;
            }
            r4 = r16;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static String m12563lr(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = xha;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX INFO: renamed from: ri */
    private C3104ri m12564ri(XmlPullParser xmlPullParser, List<C3099ik> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<C3099ik> list2;
        XmlPullParser xmlPullParser3;
        List<C3099ik> list3;
        xmlPullParser.require(2, xha, "VAST");
        boolean z = false;
        String strM12563lr = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strM12563lr = m12563lr(xmlPullParser, name);
                } else {
                    if (!"Ad".equals(name)) {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        m12569ri(xmlPullParser2);
                    } else if (m12558ri(xmlPullParser.getAttributeValue(xha, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                xmlPullParser2 = xmlPullParser;
                                list2 = list;
                                z = true;
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    xmlPullParser3 = xmlPullParser;
                                    list3 = list;
                                    C3104ri c3104riM12583ri = C3110lr.m12583ri(this.f9869lr, xmlPullParser3, list3, this.f9867ik, this.f9868ka);
                                    if (c3104riM12583ri != null) {
                                        if (!TextUtils.isEmpty(c3104riM12583ri.xha())) {
                                            return c3104riM12583ri;
                                        }
                                        this.f9866fi = -6;
                                        return null;
                                    }
                                } else {
                                    xmlPullParser3 = xmlPullParser;
                                    list3 = list;
                                    if ("Wrapper".equals(name2)) {
                                        C3104ri c3104riM12562lr = m12562lr(xmlPullParser3, list3);
                                        if (c3104riM12562lr != null) {
                                            return c3104riM12562lr;
                                        }
                                    } else {
                                        m12569ri(xmlPullParser3);
                                    }
                                }
                                xmlPullParser = xmlPullParser3;
                                list = list3;
                            }
                        }
                    } else {
                        m12569ri(xmlPullParser);
                        z = true;
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z) {
            this.f9866fi = -4;
            m12560ik(strM12563lr);
        }
        if (this.f9866fi == 0) {
            this.f9866fi = -5;
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private static List<C3099ik> m12565ri(String str, boolean z) {
        return TextUtils.isEmpty(str) ? new ArrayList() : Collections.singletonList(new C3099ik.ri(str).m12509ri(z).m12510ri());
    }

    /* JADX INFO: renamed from: ri */
    public static List<C3099ik> m12566ri(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return m12567ri(xmlPullParser, str, false);
    }

    /* JADX INFO: renamed from: ri */
    public static List<C3099ik> m12567ri(XmlPullParser xmlPullParser, String str, boolean z) throws XmlPullParserException, IOException {
        return m12565ri(m12563lr(xmlPullParser, str), z);
    }

    /* JADX INFO: renamed from: ri */
    private void m12568ri(C3104ri c3104ri) {
        if (this.f9865di == null) {
            this.f9865di = new AbstractC3105lr.ri();
        }
        this.f9865di.f9873ri = this.f9866fi;
        this.f9865di.f9872lr = this.f9870ri;
        if (c3104ri != null) {
            this.f9865di.f9871ik = c3104ri.m12546ri().f9802lr.size() <= 0;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12569ri(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12570ri(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.p190aw.p193ri.AbstractC3105lr
    /* JADX INFO: renamed from: ri */
    public C3104ri mo12555ri(String str, File file, List<C3099ik> list) throws Throwable {
        InputStream byteArrayInputStream;
        this.f9866fi = 0;
        InputStream inputStream = null;
        if (this.f9869lr == null) {
            this.f9866fi = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.f9866fi = -2;
            return null;
        }
        try {
            byteArrayInputStream = !TextUtils.isEmpty(str) ? new ByteArrayInputStream(str.getBytes("UTF-8")) : new FileInputStream(file);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                    xmlPullParserNewPullParser.nextTag();
                    C3104ri c3104riM12564ri = m12564ri(xmlPullParserNewPullParser, list);
                    m12568ri(c3104riM12564ri);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return c3104riM12564ri;
                } catch (Exception unused2) {
                    this.f9866fi = -3;
                    m12568ri((C3104ri) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = byteArrayInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }
}
