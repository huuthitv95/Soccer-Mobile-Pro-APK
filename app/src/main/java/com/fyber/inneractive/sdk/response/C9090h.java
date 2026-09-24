package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.C9187s0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C9090h {

    /* JADX INFO: renamed from: a */
    public final boolean f21334a;

    /* JADX INFO: renamed from: b */
    public String f21335b;

    public C9090h(String str) throws Exception {
        this.f21334a = false;
        try {
            m21895a(str);
            this.f21334a = true;
            IAlog.m21945a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.m21946b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21895a(String str) throws XmlPullParserException, IOException {
        String text;
        IAlog.m21945a("Start reading Response", new Object[0]);
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        xmlPullParserNewPullParser.require(2, null, "tns:Response");
        while (xmlPullParserNewPullParser.next() != 3) {
            if (xmlPullParserNewPullParser.getEventType() == 2) {
                int i = 1;
                if (xmlPullParserNewPullParser.getName().equals("tns:Ad")) {
                    xmlPullParserNewPullParser.require(2, null, "tns:Ad");
                    IAlog.m21945a("Start reading Ad", new Object[0]);
                    if (xmlPullParserNewPullParser.next() == 4) {
                        text = xmlPullParserNewPullParser.getText();
                        xmlPullParserNewPullParser.nextTag();
                    } else {
                        IAlog.m21950f("No text: %s", xmlPullParserNewPullParser.getName());
                        text = "";
                    }
                    String strTrim = text.trim();
                    IAlog.m21949e("Ad content: %s", strTrim);
                    if (strTrim == null) {
                        strTrim = null;
                    } else {
                        C9187s0 c9187s0 = C9187s0.f21482b;
                        c9187s0.getClass();
                        int iIndexOf = strTrim.indexOf(38);
                        if (iIndexOf >= 0) {
                            StringWriter stringWriter = new StringWriter((int) ((((double) strTrim.length()) * 0.1d) + ((double) strTrim.length())));
                            try {
                                c9187s0.m22014a(stringWriter, strTrim, iIndexOf);
                            } catch (IOException unused) {
                            }
                            strTrim = stringWriter.toString();
                        }
                    }
                    this.f21335b = strTrim;
                } else {
                    if (xmlPullParserNewPullParser.getEventType() != 2) {
                        throw new IllegalStateException();
                    }
                    while (i != 0) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 2) {
                            i++;
                        } else if (next == 3) {
                            i--;
                        }
                    }
                }
            }
        }
    }
}
