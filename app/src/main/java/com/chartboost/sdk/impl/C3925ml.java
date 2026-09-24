package com.chartboost.sdk.impl;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ml */
/* JADX INFO: loaded from: classes3.dex */
public final class C3925ml {

    /* JADX INFO: renamed from: a */
    public static final C3925ml f15411a = new C3925ml();

    /* JADX INFO: renamed from: a */
    public final Object m18692a(String xmlString) {
        Intrinsics.checkNotNullParameter(xmlString, "xmlString");
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            documentBuilderFactoryNewInstance.setValidating(false);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(xmlString)));
            document.getDocumentElement().normalize();
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(document);
        } catch (Exception e) {
            C4048sb.m19410b("Error parsing XML string.", e);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new C3823ib("Error parsing VAST XML: " + e.getMessage(), null, 2, null)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m18693a(Element element, String tagName) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList elementsByTagName = element.getElementsByTagName(tagName);
        int length = elementsByTagName.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = elementsByTagName.item(i);
            if (nodeItem instanceof Element) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m18694b(Element element, String name) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!element.hasAttribute(name)) {
            return null;
        }
        String attribute = element.getAttribute(name);
        Intrinsics.checkNotNullExpressionValue(attribute, "getAttribute(...)");
        String string = StringsKt.trim((CharSequence) attribute).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Element m18695c(Element element, String tagName) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName)) {
                    return element2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final List m18696d(Element element, String tagName) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if ((nodeItem instanceof Element) && Intrinsics.areEqual(((Element) nodeItem).getNodeName(), tagName)) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final String m18697e(Element element, String tagName) {
        String string;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        NodeList elementsByTagName = element.getElementsByTagName(tagName);
        int length = elementsByTagName.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = elementsByTagName.item(i);
            if (Intrinsics.areEqual(nodeItem.getParentNode(), element) && (nodeItem instanceof Element)) {
                Element element2 = (Element) nodeItem;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName)) {
                    String textContent = element2.getTextContent();
                    if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null || string.length() <= 0) {
                        return null;
                    }
                    return string;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final List m18698f(Element element, String tagName) {
        String textContent;
        String string;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (Intrinsics.areEqual(element2.getNodeName(), tagName) && (textContent = element2.getTextContent()) != null && (string = StringsKt.trim((CharSequence) textContent).toString()) != null) {
                    if (string.length() <= 0) {
                        string = null;
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
            }
        }
        return arrayList;
    }
}
