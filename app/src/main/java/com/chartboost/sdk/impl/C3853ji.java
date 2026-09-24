package com.chartboost.sdk.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ji */
/* JADX INFO: loaded from: classes3.dex */
public final class C3853ji {

    /* JADX INFO: renamed from: a */
    public static final C3853ji f14980a = new C3853ji();

    /* JADX INFO: renamed from: a */
    public final List m18288a(Element trackingEventsParentElement, C3923mj context) {
        String string;
        Intrinsics.checkNotNullParameter(trackingEventsParentElement, "trackingEventsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        for (Element element : C3925ml.f15411a.m18696d(trackingEventsParentElement, "Tracking")) {
            C3925ml c3925ml = C3925ml.f15411a;
            String strM18694b = c3925ml.m18694b(element, NotificationCompat.CATEGORY_EVENT);
            String strM18694b2 = c3925ml.m18694b(element, TypedValues.CycleType.S_WAVE_OFFSET);
            String textContent = element.getTextContent();
            if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null || string.length() <= 0) {
                string = null;
            }
            String str = string;
            if (str != null) {
                C3761fi c3761fi = new C3761fi(strM18694b, str, context.m18690c(), strM18694b2, null, null, 48, null);
                arrayList.add(c3761fi);
                context.m18689b().add(c3761fi);
            }
        }
        return arrayList;
    }
}
