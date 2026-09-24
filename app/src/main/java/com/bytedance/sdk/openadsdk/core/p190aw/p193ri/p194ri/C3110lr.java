package com.bytedance.sdk.openadsdk.core.p190aw.p193ri.p194ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3110lr {
    /* JADX INFO: renamed from: ri */
    public static C3104ri m12583ri(Context context, XmlPullParser xmlPullParser, List<C3099ik> list, int i, double d) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, C3107fi.xha, "InLine");
        C3104ri c3104ri = new C3104ri();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                c3104ri.m12546ri().m12479qt(list);
                return c3104ri;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                switch (name) {
                    case "AdVerifications":
                        c3104ri.m12553ri(C3109ka.m12582ri(xmlPullParser));
                        context = context;
                        break;
                    case "Creatives":
                        if (TextUtils.isEmpty(c3104ri.xha()) || c3104ri.m12537ik() == null) {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        m12584ri(context, xmlPullParser, c3104ri, i, d);
                                    } else {
                                        C3107fi.m12569ri(xmlPullParser);
                                    }
                                }
                            }
                        } else {
                            C3107fi.m12569ri(xmlPullParser);
                        }
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d = d;
                        break;
                    case "Description":
                        c3104ri.m12543lr(C3107fi.m12563lr(xmlPullParser, name));
                        break;
                    case "Error":
                        list.addAll(C3107fi.m12566ri(xmlPullParser, name));
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                context = context;
                                xmlPullParser = xmlPullParser;
                                i = i;
                                d = d;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    c3104ri.m12553ri(C3109ka.m12582ri(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        c3104ri.m12552ri(C3107fi.m12563lr(xmlPullParser, name));
                        break;
                    case "Impression":
                        c3104ri.m12546ri().m12488ri(C3107fi.m12566ri(xmlPullParser, name));
                        break;
                    default:
                        C3107fi.m12569ri(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d = d;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12584ri(Context context, XmlPullParser xmlPullParser, C3104ri c3104ri, int i, double d) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(c3104ri.xha())) {
                    C3108ik.m12581ri(xmlPullParser, c3104ri, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && c3104ri.m12537ik() == null) {
                    c3104ri.m12549ri(C3111ri.m12585ri(context, xmlPullParser));
                } else {
                    C3107fi.m12569ri(xmlPullParser);
                }
            }
        }
    }
}
