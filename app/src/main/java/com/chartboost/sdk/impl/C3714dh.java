package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.dh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3714dh {

    /* JADX INFO: renamed from: a */
    public static final C3714dh f13839a = new C3714dh();

    /* JADX INFO: renamed from: a */
    public final C3691ch m17304a(Element element) {
        String string;
        Intrinsics.checkNotNullParameter(element, "element");
        String strM18694b = C3925ml.f15411a.m18694b(element, "creativeType");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return new C3691ch(strM18694b, string);
        }
        return null;
    }
}
