package com.chartboost.sdk.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4059t0 {

    /* JADX INFO: renamed from: a */
    public static final C4059t0 f16312a = new C4059t0();

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX INFO: renamed from: a */
    public final C4037s0 m19449a(Element element, C3923mj context) {
        List<Element> listM18696d;
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "vendor");
        Element elementM18695c = c3925ml.m18695c(element, "JavaScriptResource");
        C3846jb c3846jbM18395a = elementM18695c != null ? C3869kb.f15059a.m18395a(elementM18695c) : null;
        Element elementM18695c2 = c3925ml.m18695c(element, "TrackingEvents");
        ArrayList arrayList = new ArrayList();
        if (elementM18695c2 != null && (listM18696d = c3925ml.m18696d(elementM18695c2, "Tracking")) != null) {
            for (Element element2 : listM18696d) {
                C3925ml c3925ml2 = C3925ml.f15411a;
                String strM18694b2 = c3925ml2.m18694b(element2, NotificationCompat.CATEGORY_EVENT);
                String strM18694b3 = c3925ml2.m18694b(element2, TypedValues.CycleType.S_WAVE_OFFSET);
                String textContent = element2.getTextContent();
                if (textContent != null) {
                    Intrinsics.checkNotNull(textContent);
                    String string = StringsKt.trim((CharSequence) textContent).toString();
                    if (string == null || string.length() <= 0) {
                        str = null;
                    } else {
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (strM18694b2 != null && str != null) {
                    arrayList.add(new C3761fi(strM18694b2, str, context.m18690c(), strM18694b3, null, null, 48, null));
                }
            }
        }
        Element elementM18695c3 = C3925ml.f15411a.m18695c(element, "VerificationParameters");
        return new C4037s0(strM18694b, c3846jbM18395a, arrayList, elementM18695c3 != null ? elementM18695c3.getTextContent() : null);
    }

    /* JADX INFO: renamed from: b */
    public final List m19450b(Element adVerificationsParentElement, C3923mj context) {
        C4037s0 c4037s0M19449a;
        Intrinsics.checkNotNullParameter(adVerificationsParentElement, "adVerificationsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List listM18696d = C3925ml.f15411a.m18696d(adVerificationsParentElement, "Verification");
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            try {
                c4037s0M19449a = f16312a.m19449a((Element) it.next(), context);
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse AdVerification element: " + e.getMessage(), e);
                c4037s0M19449a = null;
            }
            if (c4037s0M19449a != null) {
                arrayList.add(c4037s0M19449a);
            }
        }
        return arrayList;
    }
}
