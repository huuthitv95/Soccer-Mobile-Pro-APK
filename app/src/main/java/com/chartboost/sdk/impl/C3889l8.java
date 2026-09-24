package com.chartboost.sdk.impl;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3889l8 {

    /* JADX INFO: renamed from: a */
    public static final C3889l8 f15196a = new C3889l8();

    /* JADX INFO: renamed from: a */
    public final C3843j8 m18494a(Element element, C3923mj context) {
        String string;
        String strM18694b;
        String string2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        String strM18694b2 = C3925ml.f15411a.m18694b(element, "type");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                Intrinsics.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
                Element element2 = (Element) nodeItem;
                String nodeName = element2.getNodeName();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length2 = element2.getAttributes().getLength();
                for (int i2 = 0; i2 < length2; i2++) {
                    Node nodeItem2 = element2.getAttributes().item(i2);
                    String nodeName2 = nodeItem2.getNodeName();
                    Intrinsics.checkNotNullExpressionValue(nodeName2, "getNodeName(...)");
                    String nodeValue = nodeItem2.getNodeValue();
                    Intrinsics.checkNotNullExpressionValue(nodeValue, "getNodeValue(...)");
                    linkedHashMap.put(nodeName2, nodeValue);
                }
                String textContent2 = element2.getTextContent();
                String str = (textContent2 == null || (string2 = StringsKt.trim((CharSequence) textContent2).toString()) == null || string2.length() <= 0) ? null : string2;
                if (Intrinsics.areEqual(nodeName, "Tracking") && Intrinsics.areEqual(element2.getParentNode(), element) && (strM18694b = C3925ml.f15411a.m18694b(element2, NotificationCompat.CATEGORY_EVENT)) != null && str != null) {
                    context.m18689b().add(new C3761fi(strM18694b, str, context.m18690c(), null, null, null, 56, null));
                }
                Intrinsics.checkNotNull(nodeName);
                arrayList.add(new C3866k8(nodeName, linkedHashMap, str));
            }
        }
        return new C3843j8(strM18694b2, string, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final List m18495b(Element extensionsParentElement, C3923mj context) {
        C3843j8 c3843j8M18494a;
        Intrinsics.checkNotNullParameter(extensionsParentElement, "extensionsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List listM18696d = C3925ml.f15411a.m18696d(extensionsParentElement, "Extension");
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            try {
                c3843j8M18494a = f15196a.m18494a((Element) it.next(), context);
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse Extension element: " + e.getMessage(), e);
                c3843j8M18494a = null;
            }
            if (c3843j8M18494a != null) {
                arrayList.add(c3843j8M18494a);
            }
        }
        return arrayList;
    }
}
