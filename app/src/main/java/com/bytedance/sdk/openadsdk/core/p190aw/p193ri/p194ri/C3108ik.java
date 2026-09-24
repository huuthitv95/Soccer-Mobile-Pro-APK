package com.bytedance.sdk.openadsdk.core.p190aw.p193ri.p194ri;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.C3098lr;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3094ka;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3096ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3101ri;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3108ik {
    /* JADX INFO: renamed from: ik */
    private static List<C3099ik> m12574ik(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m12578ri(xmlPullParser, false);
    }

    /* JADX INFO: renamed from: lr */
    public static double m12575lr(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArrSplit = C3107fi.m12563lr(xmlPullParser, "Duration").split(CertificateUtil.DELIMITER);
        if (strArrSplit.length != 3) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        try {
            return (Integer.parseInt(strArrSplit[0].trim()) * 3600) + (Integer.parseInt(strArrSplit[1].trim()) * 60) + Float.parseFloat(strArrSplit[2].trim());
        } catch (Exception unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX INFO: renamed from: ri */
    public static C3098lr m12576ri(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C3098lr c3098lr;
        int i;
        int i2;
        int i3;
        C3098lr c3098lr2 = null;
        while (true) {
            int i4 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return c3098lr2;
            }
            xmlPullParser.next();
            int i5 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                int iM12561lr = C3107fi.m12561lr(xmlPullParser.getAttributeValue(C3107fi.xha, "width"));
                int iM12561lr2 = C3107fi.m12561lr(xmlPullParser.getAttributeValue(C3107fi.xha, "height"));
                if (iM12561lr <= 0 || iM12561lr > 300 || iM12561lr2 <= 0 || iM12561lr2 > 300) {
                    C3107fi.m12569ri(xmlPullParser);
                    c3098lr2 = c3098lr2;
                } else {
                    int iM12514ri = C3101ri.m12514ri(xmlPullParser.getAttributeValue(C3107fi.xha, TypedValues.CycleType.S_WAVE_OFFSET));
                    int iM12514ri2 = C3101ri.m12514ri(xmlPullParser.getAttributeValue(C3107fi.xha, "duration"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C3107fi.ri riVar = null;
                    String strM12563lr = null;
                    while (true) {
                        if (xmlPullParser.next() != i4 || !xmlPullParser.getName().equals("Icon")) {
                            arrayList = arrayList;
                            ArrayList arrayList3 = arrayList2;
                            if (xmlPullParser.getEventType() == i5) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                c3098lr = c3098lr2;
                                i = iM12514ri;
                                switch (name) {
                                    case "IconViewTracking":
                                        i2 = 3;
                                        i3 = 2;
                                        arrayList3.add(new C3099ik.ri(C3107fi.m12563lr(xmlPullParser, "IconViewTracking")).m12510ri());
                                        break;
                                    case "IFrameResource":
                                        i2 = 3;
                                        i3 = 2;
                                        if (riVar != null) {
                                            C3107fi.m12569ri(xmlPullParser);
                                            break;
                                        } else {
                                            riVar = new C3107fi.ri(C3107fi.m12563lr(xmlPullParser, "IFrameResource"), C3096ri.ri.NONE, C3096ri.lr.IFRAME_RESOURCE);
                                            break;
                                        }
                                        break;
                                    case "StaticResource":
                                        i2 = 3;
                                        i3 = 2;
                                        C3096ri.ri riVar2 = C3096ri.ri.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(C3107fi.xha, "creativeType").toLowerCase();
                                        riVar = new C3107fi.ri((C3096ri.f9783ri.contains(lowerCase) || C3096ri.f9782lr.contains(lowerCase)) ? C3107fi.m12563lr(xmlPullParser, "StaticResource") : null, C3096ri.f9783ri.contains(lowerCase) ? C3096ri.ri.IMAGE : C3096ri.ri.JAVASCRIPT, C3096ri.lr.STATIC_RESOURCE);
                                        break;
                                    case "IconClicks":
                                        while (true) {
                                            i2 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i3 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strM12563lr = C3107fi.m12563lr(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList.add(new C3099ik.ri(C3107fi.m12563lr(xmlPullParser, "IconClickTracking")).m12510ri());
                                                }
                                            }
                                        }
                                        break;
                                    case "HTMLResource":
                                        if (riVar != null && riVar.f9883ik != C3096ri.lr.IFRAME_RESOURCE) {
                                            i2 = 3;
                                            i3 = 2;
                                            C3107fi.m12569ri(xmlPullParser);
                                            break;
                                        } else {
                                            riVar = new C3107fi.ri(C3107fi.m12563lr(xmlPullParser, "HTMLResource"), C3096ri.ri.NONE, C3096ri.lr.HTML_RESOURCE);
                                            c3098lr2 = c3098lr;
                                            iM12514ri = i;
                                            i4 = 3;
                                            i5 = 2;
                                            break;
                                        }
                                        break;
                                    default:
                                        i2 = 3;
                                        i3 = 2;
                                        C3107fi.m12569ri(xmlPullParser);
                                        break;
                                }
                                arrayList2 = arrayList3;
                            } else {
                                c3098lr = c3098lr2;
                                i = iM12514ri;
                                i2 = i4;
                                i3 = i5;
                            }
                            i4 = i2;
                            i5 = i3;
                            c3098lr2 = c3098lr;
                            iM12514ri = i;
                            arrayList2 = arrayList3;
                        } else if (riVar != null && (c3098lr2 == null || TextUtils.isEmpty(c3098lr2.m12421fi()))) {
                            c3098lr2 = new C3098lr(iM12561lr, iM12561lr2, iM12514ri, iM12514ri2, riVar.f9885lr, riVar.f9883ik, riVar.f9886ri, arrayList, arrayList2, strM12563lr);
                            C3107fi.m12570ri(xmlPullParser, "Icons", i4);
                        }
                    }
                }
            } else {
                c3098lr2 = c3098lr2;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static String m12577ri(XmlPullParser xmlPullParser, int i, double d, C3104ri c3104ri) throws XmlPullParserException, IOException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String attributeValue = xmlPullParser.getAttributeValue(C3107fi.xha, "type");
                int iM12561lr = C3107fi.m12561lr(xmlPullParser.getAttributeValue(C3107fi.xha, "width"));
                int iM12561lr2 = C3107fi.m12561lr(xmlPullParser.getAttributeValue(C3107fi.xha, "height"));
                int iM12561lr3 = C3107fi.m12561lr(xmlPullParser.getAttributeValue(C3107fi.xha, "bitrate"));
                String strM12563lr = C3107fi.m12563lr(xmlPullParser, "MediaFile");
                if (iM12561lr > 0 && iM12561lr2 > 0 && C3094ka.f9756ri.contains(attributeValue) && !TextUtils.isEmpty(strM12563lr)) {
                    double dM12445ri = C3094ka.m12445ri(i, d, iM12561lr, iM12561lr2, iM12561lr3, attributeValue);
                    if (dM12445ri > d2) {
                        str = strM12563lr;
                        i2 = iM12561lr;
                        i3 = iM12561lr2;
                        d2 = dM12445ri;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            c3104ri.m12540ka(str);
            c3104ri.m12548ri(i2);
            c3104ri.m12542lr(i3);
        }
        return str;
    }

    /* JADX INFO: renamed from: ri */
    private static List<C3099ik> m12578ri(XmlPullParser xmlPullParser, boolean z) throws XmlPullParserException, IOException {
        return C3107fi.m12567ri(xmlPullParser, "Tracking", z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public static void m12579ri(XmlPullParser xmlPullParser, C3097ka c3097ka) throws XmlPullParserException, IOException {
        while (true) {
            byte b = 3;
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(C3107fi.xha, NotificationCompat.CATEGORY_EVENT);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -1638835128:
                                b = !attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT) ? (byte) -1 : (byte) 0;
                                break;
                            case -1337830390:
                                b = !attributeValue.equals("thirdQuartile") ? (byte) -1 : (byte) 1;
                                break;
                            case -934426579:
                                b = !attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME) ? (byte) -1 : (byte) 2;
                                break;
                            case -840405966:
                                if (!attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE)) {
                                    b = -1;
                                }
                                break;
                            case -599445191:
                                b = !attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) ? (byte) -1 : (byte) 4;
                                break;
                            case 3363353:
                                b = !attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? (byte) -1 : (byte) 5;
                                break;
                            case 3532159:
                                b = !attributeValue.equals("skip") ? (byte) -1 : (byte) 6;
                                break;
                            case 94756344:
                                b = !attributeValue.equals("close") ? (byte) -1 : (byte) 7;
                                break;
                            case 106440182:
                                b = !attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE) ? (byte) -1 : (byte) 8;
                                break;
                            case 109757538:
                                b = !attributeValue.equals("start") ? (byte) -1 : (byte) 9;
                                break;
                            case 560220243:
                                b = !attributeValue.equals("firstQuartile") ? (byte) -1 : (byte) 10;
                                break;
                            case 1778167540:
                                b = !attributeValue.equals("creativeView") ? (byte) -1 : Ascii.f22503VT;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                c3097ka.m12486ri(C3107fi.m12563lr(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case 1:
                                c3097ka.m12486ri(C3107fi.m12563lr(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case 2:
                                c3097ka.m12472ik(m12578ri(xmlPullParser, true));
                                break;
                            case 3:
                                c3097ka.m12466co(m12578ri(xmlPullParser, true));
                                break;
                            case 4:
                                c3097ka.m12474ka(m12574ik(xmlPullParser));
                                break;
                            case 5:
                                c3097ka.m12490sf(m12578ri(xmlPullParser, true));
                                break;
                            case 6:
                                c3097ka.m12468di(m12574ik(xmlPullParser));
                                break;
                            case 7:
                                c3097ka.m12470fi(m12574ik(xmlPullParser));
                                break;
                            case 8:
                                c3097ka.m12476lr(m12578ri(xmlPullParser, true));
                                break;
                            case 9:
                            case 11:
                                c3097ka.m12487ri(C3107fi.m12563lr(xmlPullParser, "Tracking"), 0L);
                                break;
                            case 10:
                                c3097ka.m12486ri(C3107fi.m12563lr(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    } else {
                        C3107fi.m12570ri(xmlPullParser, "Tracking", 3);
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    C3107fi.m12569ri(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m12580ri(XmlPullParser xmlPullParser, C3104ri c3104ri) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ClickThrough")) {
                    c3104ri.m12538ik(C3107fi.m12563lr(xmlPullParser, "ClickThrough"));
                } else if (name.equals("ClickTracking")) {
                    c3104ri.m12546ri().xha(C3107fi.m12566ri(xmlPullParser, "ClickTracking"));
                } else {
                    C3107fi.m12569ri(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12581ri(XmlPullParser xmlPullParser, C3104ri c3104ri, int i, double d) throws XmlPullParserException, IOException {
        boolean z = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && TextUtils.isEmpty(c3104ri.xha())) {
                        C3107fi.m12569ri(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "VideoClicks":
                            m12580ri(xmlPullParser, c3104ri);
                            break;
                        case "Duration":
                            c3104ri.m12547ri(m12575lr(xmlPullParser));
                            break;
                        case "MediaFiles":
                            m12577ri(xmlPullParser, i, d, c3104ri);
                            z = true;
                            break;
                        case "Icons":
                            C3098lr c3098lrM12576ri = m12576ri(xmlPullParser);
                            if (c3098lrM12576ri != null && c3104ri.m12541lr() == null) {
                                c3104ri.m12550ri(c3098lrM12576ri);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            m12579ri(xmlPullParser, c3104ri.m12546ri());
                            break;
                        default:
                            C3107fi.m12569ri(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }
}
