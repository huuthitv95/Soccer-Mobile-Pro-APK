package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.w1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9203w1 {
    /* JADX INFO: renamed from: a */
    public static Integer m22039a(Node node, String str) {
        String strM22041b = m22041b(node, str);
        if (TextUtils.isEmpty(strM22041b)) {
            return null;
        }
        try {
            return Integer.valueOf(strM22041b);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m22040a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    /* JADX INFO: renamed from: b */
    public static String m22041b(Node node, String str) {
        Node namedItem;
        if (node == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m22042c(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeName().equals(str)) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static Node m22043d(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeName().equals(str)) {
                return nodeItem;
            }
        }
        return null;
    }
}
