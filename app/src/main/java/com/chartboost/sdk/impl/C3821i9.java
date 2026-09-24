package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3821i9 {

    /* JADX INFO: renamed from: a */
    public static final C3821i9 f14573a = new C3821i9();

    /* JADX INFO: renamed from: a */
    public final C3798h9 m17967a(Element element) {
        String string;
        Intrinsics.checkNotNullParameter(element, "element");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return new C3798h9(string);
        }
        return null;
    }
}
