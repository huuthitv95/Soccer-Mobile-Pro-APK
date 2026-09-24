package com.bytedance.sdk.openadsdk.core.p190aw.p193ri.p194ri;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.p190aw.C3103qt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3109ka {
    /* JADX INFO: renamed from: ri */
    public static Set<C3103qt> m12582ri(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C3103qt c3103qtM12523ri;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(C3107fi.xha, "vendor");
                    String strM12563lr = null;
                    String strM12563lr2 = null;
                    String strM12563lr3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(C3107fi.xha, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strM12563lr3 = C3107fi.m12563lr(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(C3107fi.xha, "apiFramework"))) {
                                            break;
                                        } else {
                                            strM12563lr = C3107fi.m12563lr(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strM12563lr2 = C3107fi.m12563lr(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strM12563lr) && (c3103qtM12523ri = C3103qt.m12523ri(strM12563lr, attributeValue, strM12563lr2, strM12563lr3)) != null) {
                            hashSet.add(c3103qtM12523ri);
                        }
                    }
                } else {
                    C3107fi.m12569ri(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
