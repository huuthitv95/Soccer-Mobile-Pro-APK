package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.b9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3660b9 {

    /* JADX INFO: renamed from: a */
    public static final C3660b9 f13550a = new C3660b9();

    /* JADX INFO: renamed from: a */
    public final C3637a9 m16911a(Element element) {
        String string;
        Intrinsics.checkNotNullParameter(element, "element");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return new C3637a9(string);
        }
        return null;
    }
}
