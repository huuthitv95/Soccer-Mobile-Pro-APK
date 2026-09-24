package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C11341A5;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.utils.C12899a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.b */
/* JADX INFO: compiled from: ComponentLayoutInflate.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12862b {

    /* JADX INFO: renamed from: d */
    private static final Class<?>[] f34505d = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: e */
    private static final HashMap<String, Constructor<?>> f34506e = new HashMap<>();

    /* JADX INFO: renamed from: a */
    private final Context f34507a;

    /* JADX INFO: renamed from: b */
    private final C12894a f34508b;

    /* JADX INFO: renamed from: c */
    private final Object[] f34509c = new Object[2];

    public C12862b(Context context, C12894a c12894a) {
        this.f34507a = context;
        this.f34508b = c12894a;
    }

    /* JADX INFO: renamed from: b */
    private void m35890b(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (!(view instanceof ViewGroup)) {
            throw new InflateException("<include /> can only be used inside of a ViewGroup");
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "layout", 0);
        if (attributeResourceValue == 0) {
            String attributeValue = attributeSet.getAttributeValue(null, "layout");
            if (attributeValue == null) {
                throw new InflateException("You must specify a layout in the include tag: <include layout=\"@layout/layoutID\" />");
            }
            throw new InflateException("You must specify a valid layout reference. The layout ID " + attributeValue + " is not valid.");
        }
        try {
            XmlResourceParser layout = this.f34507a.getResources().getLayout(attributeResourceValue);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (layout.next() == 2) {
                    if ("merge".equals(layout.getName())) {
                        m35889a(layout, view, attributeSetAsAttributeSet);
                    }
                    layout.close();
                } else {
                    throw new InflateException(layout.getPositionDescription() + ": No start tag found!");
                }
            } catch (Throwable th) {
                if (layout != null) {
                    try {
                        layout.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            throw new InflateException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public View m35891a(String str, ViewGroup viewGroup) {
        return m35892a(str, viewGroup, viewGroup != null);
    }

    /* JADX INFO: renamed from: a */
    public View m35892a(String str, ViewGroup viewGroup, boolean z) {
        return m35888a(m35894a(str), viewGroup, z);
    }

    /* JADX INFO: renamed from: a */
    public XmlPullParser m35894a(String str) {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new FileInputStream(str), C11341A5.f23802O);
            return xmlPullParserNewPullParser;
        } catch (Exception e) {
            C13219q0.m37817b("ComponentLayoutInflate", e.getMessage(), e);
            return xmlPullParserNewPullParser;
        }
    }

    /* JADX INFO: renamed from: a */
    private View m35888a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        View view;
        synchronized (this.f34509c) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f34509c[0] = this.f34507a;
            try {
                if (xmlPullParser.next() == 2) {
                    String name = xmlPullParser.getName();
                    C13219q0.m37820d("ComponentLayoutInflate", "********Creating root view: " + name);
                    if (!"merge".equals(name)) {
                        View viewM35887a = m35887a(name, attributeSetAsAttributeSet, viewGroup);
                        m35889a(xmlPullParser, viewM35887a, attributeSetAsAttributeSet);
                        view = viewM35887a;
                    } else if (viewGroup != null && z) {
                        m35889a(xmlPullParser, viewGroup, attributeSetAsAttributeSet);
                        view = viewGroup;
                    } else {
                        throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                    }
                } else {
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                }
            } catch (IOException e) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    private View m35887a(String str, AttributeSet attributeSet, ViewGroup viewGroup) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        C13219q0.m37820d("ComponentLayoutInflate", "******** Creating view: " + str);
        try {
            View viewM35893a = m35893a(str, -1 == str.indexOf(46) ? "com.mbridge.msdk.config.dynamic.baseview.Component" : null, attributeSet);
            C12899a.m36079a(viewM35893a, attributeSet, viewGroup, this.f34508b);
            return viewM35893a;
        } catch (InflateException e) {
            throw e;
        } catch (Exception e2) {
            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str, e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final View m35893a(String str, String str2, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        String str3;
        HashMap<String, Constructor<?>> map = f34506e;
        Constructor<?> constructor = map.get(str);
        if (str2 != null) {
            str3 = str2 + str;
        } else {
            str3 = str;
        }
        Class<?> clsLoadClass = null;
        try {
            if (constructor == null) {
                clsLoadClass = this.f34507a.getClassLoader().loadClass(str3);
                constructor = clsLoadClass.getConstructor(f34505d);
                map.put(str, constructor);
            } else {
                clsLoadClass = this.f34507a.getClassLoader().loadClass(str3);
            }
            Object[] objArr = this.f34509c;
            objArr[1] = attributeSet;
            return (View) constructor.newInstance(objArr);
        } catch (ClassNotFoundException e) {
            throw e;
        } catch (NoSuchMethodException e2) {
            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str3, e2);
        } catch (Exception e3) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Error inflating class ");
            sb.append(clsLoadClass == null ? "<unknown>" : clsLoadClass.getName());
            throw new InflateException(sb.toString(), e3);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35889a(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    view.requestFocus();
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        m35890b(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    m35889a(xmlPullParser, m35887a(name, attributeSet, (ViewGroup) view), attributeSet);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }
}
