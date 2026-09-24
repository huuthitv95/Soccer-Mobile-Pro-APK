package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: com.applovin.impl.r8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1712r8 {

    /* JADX INFO: renamed from: a */
    private final C1768p f2777a;

    /* JADX INFO: renamed from: b */
    private Stack f2778b;

    /* JADX INFO: renamed from: c */
    private StringBuilder f2779c;

    /* JADX INFO: renamed from: d */
    private long f2780d;

    /* JADX INFO: renamed from: e */
    private b f2781e;

    /* JADX INFO: renamed from: com.applovin.impl.r8$a */
    class a implements ContentHandler {
        a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
            if (StringUtils.isValidString(strTrim)) {
                C1712r8.this.f2779c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C1712r8.this.f2780d;
            C1768p unused = C1712r8.this.f2777a;
            if (C1768p.m5160a()) {
                C1712r8.this.f2777a.m5171a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            C1712r8 c1712r8 = C1712r8.this;
            c1712r8.f2781e = (b) c1712r8.f2778b.pop();
            C1712r8.this.f2781e.m4300d(C1712r8.this.f2779c.toString().trim());
            C1712r8.this.f2779c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            C1768p unused = C1712r8.this.f2777a;
            if (C1768p.m5160a()) {
                C1712r8.this.f2777a.m5171a("XmlParser", "Begin parsing...");
            }
            C1712r8.this.f2780d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !C1712r8.this.f2778b.isEmpty() ? (b) C1712r8.this.f2778b.peek() : null;
                b bVar2 = new b(str2, C1712r8.this.m4293a(attributes), bVar);
                if (bVar != null) {
                    bVar.m4299a(bVar2);
                }
                C1712r8.this.f2778b.push(bVar2);
            } catch (Exception e) {
                C1768p unused = C1712r8.this.f2777a;
                if (C1768p.m5160a()) {
                    C1712r8.this.f2777a.m5172a("XmlParser", "Unable to process element <" + str2 + ">", e);
                }
                throw new SAXException("Failed to start element", e);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.r8$b */
    private static class b extends C1702q8 {
        b(String str, Map map, C1702q8 c1702q8) {
            super(str, map, c1702q8);
        }

        /* JADX INFO: renamed from: a */
        void m4299a(C1702q8 c1702q8) {
            if (c1702q8 == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f2674e.add(c1702q8);
        }

        /* JADX INFO: renamed from: d */
        void m4300d(String str) {
            this.f2673d = str;
        }
    }

    C1712r8(C1748l c1748l) {
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f2777a = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    public static C1702q8 m4289a(String str, C1748l c1748l) {
        return new C1712r8(c1748l).m4298a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Map m4293a(Attributes attributes) {
        if (attributes == null) {
            return Collections.EMPTY_MAP;
        }
        int length = attributes.getLength();
        HashMap map = new HashMap(length);
        for (int i = 0; i < length; i++) {
            map.put(attributes.getQName(i), attributes.getValue(i));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public C1702q8 m4298a(String str) throws SAXException {
        if (str == null) {
            throw new IllegalArgumentException("Unable to parse. No XML specified.");
        }
        this.f2779c = new StringBuilder();
        this.f2778b = new Stack();
        this.f2781e = null;
        Xml.parse(str, new a());
        b bVar = this.f2781e;
        if (bVar != null) {
            return bVar;
        }
        throw new SAXException("Unable to parse XML into node");
    }
}
