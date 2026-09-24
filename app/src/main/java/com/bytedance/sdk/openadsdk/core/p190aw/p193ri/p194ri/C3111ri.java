package com.bytedance.sdk.openadsdk.core.p190aw.p193ri.p194ri;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.p190aw.C3092ik;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3096ri;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3111ri {
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x011e. Please report as an issue. */
    /* JADX INFO: renamed from: ri */
    public static C3092ik m12585ri(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C3107fi.ri riVar;
        int i;
        byte b;
        if (context == null) {
            C3107fi.m12569ri(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int i4 = (int) (i2 / displayMetrics.density);
        int i5 = (int) (i3 / displayMetrics.density);
        float f = Float.MIN_VALUE;
        C3092ik c3092ik = null;
        while (true) {
            int i6 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return c3092ik;
            }
            xmlPullParser.next();
            int i7 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                int iM12561lr = C3107fi.m12561lr(xmlPullParser.getAttributeValue(C3107fi.xha, "width"));
                int iM12561lr2 = C3107fi.m12561lr(xmlPullParser.getAttributeValue(C3107fi.xha, "height"));
                if (iM12561lr < 300 || iM12561lr2 < 250) {
                    C3107fi.m12569ri(xmlPullParser);
                    f = f;
                    c3092ik = c3092ik;
                } else {
                    C3107fi.ri riVar2 = new C3107fi.ri();
                    while (true) {
                        if (xmlPullParser.getEventType() != i6 || !xmlPullParser.getName().equals("Companion")) {
                            iM12561lr2 = iM12561lr2;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i7) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                f = f;
                                c3092ik = c3092ik;
                                byte b2 = -1;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            b = 0;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            b = 1;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            b2 = 2;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            b2 = 3;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            b = 4;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            b = 5;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        C3107fi.ri riVar3 = riVar2;
                                        i = 2;
                                        Point pointM12456ri = C3096ri.m12456ri(context, iM12561lr, iM12561lr2, C3096ri.lr.HTML_RESOURCE);
                                        float fM12419ri = C3092ik.m12419ri(i4, i5, pointM12456ri.x, pointM12456ri.y, C3096ri.lr.IFRAME_RESOURCE, C3096ri.ri.NONE);
                                        String strM12563lr = C3107fi.m12563lr(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strM12563lr) && fM12419ri > riVar3.xha && fM12419ri > f) {
                                            riVar3.xha = fM12419ri;
                                            riVar3.m12573ri(strM12563lr, C3096ri.ri.NONE, C3096ri.lr.IFRAME_RESOURCE);
                                            riVar2 = riVar3;
                                            i7 = i;
                                            iM12561lr2 = iM12561lr2;
                                            f = f;
                                            c3092ik = c3092ik;
                                            i6 = 3;
                                        } else {
                                            C3107fi.m12570ri(xmlPullParser, "IFrameResource", 3);
                                            riVar2 = riVar3;
                                            i7 = 2;
                                            f = f;
                                            c3092ik = c3092ik;
                                            i6 = 3;
                                        }
                                        break;
                                    case 1:
                                        i = 2;
                                        riVar2.f9884ka = C3107fi.m12563lr(xmlPullParser, "CompanionClickThrough");
                                        i7 = i;
                                        iM12561lr2 = iM12561lr2;
                                        f = f;
                                        c3092ik = c3092ik;
                                        i6 = 3;
                                        break;
                                    case 2:
                                        riVar = riVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                riVar2 = riVar;
                                                i6 = 3;
                                                i7 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                riVar.m12571lr(C3107fi.m12563lr(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        riVar = riVar2;
                                        C3096ri.ri riVar4 = C3096ri.ri.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(C3107fi.xha, "creativeType").toLowerCase();
                                        C3096ri.ri riVar5 = C3096ri.f9783ri.contains(lowerCase) ? C3096ri.ri.IMAGE : C3096ri.ri.JAVASCRIPT;
                                        Point pointM12456ri2 = C3096ri.m12456ri(context, iM12561lr, iM12561lr2, C3096ri.lr.STATIC_RESOURCE);
                                        float fM12419ri2 = C3092ik.m12419ri(i4, i5, pointM12456ri2.x, pointM12456ri2.y, C3096ri.lr.STATIC_RESOURCE, riVar5);
                                        String strM12563lr2 = (C3096ri.f9783ri.contains(lowerCase) || C3096ri.f9782lr.contains(lowerCase)) ? C3107fi.m12563lr(xmlPullParser, "StaticResource") : null;
                                        if (fM12419ri2 >= riVar.xha && fM12419ri2 > f && !TextUtils.isEmpty(strM12563lr2)) {
                                            riVar.xha = fM12419ri2;
                                            riVar.m12573ri(strM12563lr2, riVar5, C3096ri.lr.STATIC_RESOURCE);
                                            riVar2 = riVar;
                                            i6 = 3;
                                            i7 = 2;
                                        } else {
                                            C3107fi.m12570ri(xmlPullParser, "StaticResource", 3);
                                            riVar2 = riVar;
                                            i6 = 3;
                                            i7 = 2;
                                        }
                                        break;
                                    case 4:
                                        riVar2.m12572ri(C3107fi.m12563lr(xmlPullParser, "CompanionClickTracking"));
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                    case 5:
                                        Point pointM12456ri3 = C3096ri.m12456ri(context, iM12561lr, iM12561lr2, C3096ri.lr.HTML_RESOURCE);
                                        riVar = riVar2;
                                        float fM12419ri3 = C3092ik.m12419ri(i4, i5, pointM12456ri3.x, pointM12456ri3.y, C3096ri.lr.HTML_RESOURCE, C3096ri.ri.NONE);
                                        String strM12563lr3 = C3107fi.m12563lr(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strM12563lr3) && fM12419ri3 > riVar.xha && fM12419ri3 > f) {
                                            riVar.xha = fM12419ri3;
                                            riVar.m12573ri(strM12563lr3, C3096ri.ri.NONE, C3096ri.lr.HTML_RESOURCE);
                                            riVar2 = riVar;
                                            i6 = 3;
                                            i7 = 2;
                                        } else {
                                            C3107fi.m12570ri(xmlPullParser, "HTMLResource", 3);
                                            i6 = 3;
                                            riVar2 = riVar;
                                            i7 = 2;
                                        }
                                        break;
                                    default:
                                        C3107fi.m12569ri(xmlPullParser);
                                        riVar = riVar2;
                                        riVar2 = riVar;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                }
                            }
                            iM12561lr2 = iM12561lr2;
                        } else if (!TextUtils.isEmpty(riVar2.f9886ri) && riVar2.xha >= f) {
                            C3092ik c3092ik2 = new C3092ik(iM12561lr, iM12561lr2, riVar2.f9885lr, riVar2.f9883ik, riVar2.f9886ri, riVar2.f9882fi, riVar2.f9881di, riVar2.f9884ka);
                            f = riVar2.xha;
                            c3092ik = c3092ik2;
                        }
                    }
                }
            } else {
                f = f;
                c3092ik = c3092ik;
            }
        }
    }
}
