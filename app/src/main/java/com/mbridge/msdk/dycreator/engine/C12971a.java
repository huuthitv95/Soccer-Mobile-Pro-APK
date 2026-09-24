package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C11341A5;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.engine.a */
/* JADX INFO: compiled from: MBLayoutInflate.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12971a {

    /* JADX INFO: renamed from: e */
    private static final Class[] f35274e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f */
    private static final HashMap<String, Constructor> f35275f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private static String f35276g = "com.mbridge.msdk.dycreator.baseview.MB";

    /* JADX INFO: renamed from: b */
    protected final Context f35278b;

    /* JADX INFO: renamed from: d */
    private long f35280d;

    /* JADX INFO: renamed from: a */
    private final boolean f35277a = true;

    /* JADX INFO: renamed from: c */
    private final Object[] f35279c = new Object[2];

    public C12971a(Context context) {
        this.f35278b = context;
    }

    /* JADX INFO: renamed from: a */
    public Context m36353a() {
        return this.f35278b;
    }

    /* JADX INFO: renamed from: b */
    protected View m36360b(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return (str.equals("MBStarLevelLayoutView") || str.equals("LuckPan")) ? m36357a(str, "", attributeSet) : m36357a(str, f35276g, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public View m36355a(String str, ViewGroup viewGroup) {
        return m36356a(str, viewGroup, viewGroup != null);
    }

    /* JADX INFO: renamed from: a */
    public View m36356a(String str, ViewGroup viewGroup, boolean z) {
        this.f35280d = System.currentTimeMillis();
        System.out.println("INFLATING from resource: " + str);
        return m36358a(m36359a(str), viewGroup, z);
    }

    /* JADX INFO: renamed from: b */
    private void m36352b(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    m36350a(xmlPullParser, view);
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        m36351a(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    View viewM36354a = m36354a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    m36352b(xmlPullParser, viewM36354a, attributeSet);
                    viewGroup.addView(viewM36354a, layoutParamsGenerateLayoutParams);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public XmlPullParser m36359a(String str) {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new FileInputStream(str), C11341A5.f23802O);
            return xmlPullParserNewPullParser;
        } catch (Exception e) {
            e.printStackTrace();
            return xmlPullParserNewPullParser;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    /* JADX INFO: renamed from: a */
    public View m36358a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        int next;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        synchronized (this.f35279c) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f35279c[0] = this.f35278b;
            do {
                try {
                    try {
                        next = xmlPullParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (XmlPullParserException e) {
                        InflateException inflateException = new InflateException(e.getMessage());
                        inflateException.initCause(e);
                        throw inflateException;
                    }
                } catch (IOException e2) {
                    InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException2.initCause(e2);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                String name = xmlPullParser.getName();
                System.out.println("**************************");
                System.out.println("Creating root view: " + name);
                System.out.println("**************************");
                if (!"merge".equals(name)) {
                    View viewM36354a = m36354a(name, attributeSetAsAttributeSet);
                    if (viewGroup != 0) {
                        System.out.println("Creating params from root: " + ((Object) viewGroup));
                        layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSetAsAttributeSet);
                        if (!z) {
                            viewM36354a.setLayoutParams(layoutParamsGenerateLayoutParams);
                        }
                    } else {
                        layoutParamsGenerateLayoutParams = null;
                    }
                    System.out.println("-----> start inflating children");
                    m36352b(xmlPullParser, viewM36354a, attributeSetAsAttributeSet);
                    System.out.println("-----> done inflating children");
                    if (viewGroup != 0 && z) {
                        viewGroup.addView(viewM36354a, layoutParamsGenerateLayoutParams);
                    }
                    if (viewGroup == 0 || !z) {
                        viewGroup = viewM36354a;
                    }
                } else if (viewGroup != 0 && z) {
                    m36352b(xmlPullParser, viewGroup, attributeSetAsAttributeSet);
                } else {
                    throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                }
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final View m36357a(String str, String str2, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        String str3;
        HashMap<String, Constructor> map = f35275f;
        Constructor<?> constructor = map.get(str);
        Class<?> clsLoadClass = null;
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.f35278b.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                clsLoadClass = classLoader.loadClass(str3);
                constructor = clsLoadClass.getConstructor(f35274e);
                map.put(str, constructor);
            } catch (ClassNotFoundException e) {
                throw e;
            } catch (NoSuchMethodException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append(attributeSet.getPositionDescription());
                sb.append(": Error inflating class ");
                if (str2 != null) {
                    str = str2 + str;
                }
                sb.append(str);
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e2);
                throw inflateException;
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Error inflating class ");
                sb2.append(clsLoadClass == null ? "<unknown>" : clsLoadClass.getName());
                InflateException inflateException2 = new InflateException(sb2.toString());
                inflateException2.initCause(e3);
                throw inflateException2;
            }
        }
        Object[] objArr = this.f35279c;
        objArr[1] = attributeSet;
        return (View) constructor.newInstance(objArr);
    }

    /* JADX INFO: renamed from: a */
    View m36354a(String str, AttributeSet attributeSet) {
        View viewM36357a;
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        System.out.println("******** Creating view: " + str);
        try {
            if (-1 == str.indexOf(46)) {
                viewM36357a = m36360b(str, attributeSet);
            } else {
                viewM36357a = m36357a(str, (String) null, attributeSet);
            }
            System.out.println("Created view is: " + viewM36357a);
            return viewM36357a;
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36350a(XmlPullParser xmlPullParser, View view) throws XmlPullParserException, IOException {
        int next;
        view.requestFocus();
        int depth = xmlPullParser.getDepth();
        do {
            next = xmlPullParser.next();
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        } while (next != 1);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x00b4, PHI: r8
  0x0077: PHI (r8v4 android.view.ViewGroup$LayoutParams) = (r8v3 android.view.ViewGroup$LayoutParams), (r8v5 android.view.ViewGroup$LayoutParams) binds: [B:29:0x0075, B:24:0x006c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b4, blocks: (B:13:0x0041, B:14:0x0045, B:19:0x0052, B:21:0x005e, B:22:0x0062, B:31:0x007a, B:30:0x0077, B:40:0x0098, B:41:0x0099, B:42:0x00b3, B:23:0x0068, B:28:0x0071), top: B:48:0x0041, inners: #2 }] */
    /* JADX INFO: renamed from: a */
    private void m36351a(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int next;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        int next2;
        if (view instanceof ViewGroup) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "layout", 0);
            if (attributeResourceValue == 0) {
                String attributeValue = attributeSet.getAttributeValue(null, "layout");
                if (attributeValue == null) {
                    throw new InflateException("You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />");
                }
                throw new InflateException("You must specifiy a valid layout reference. The layout ID " + attributeValue + " is not valid.");
            }
            XmlResourceParser layout = m36353a().getResources().getLayout(attributeResourceValue);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                do {
                    next = layout.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = layout.getName();
                    if ("merge".equals(name)) {
                        m36352b(layout, view, attributeSetAsAttributeSet);
                    } else {
                        View viewM36354a = m36354a(name, attributeSetAsAttributeSet);
                        ViewGroup viewGroup = (ViewGroup) view;
                        try {
                            layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                            if (layoutParamsGenerateLayoutParams != null) {
                                viewM36354a.setLayoutParams(layoutParamsGenerateLayoutParams);
                            }
                        } catch (RuntimeException unused) {
                            layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSetAsAttributeSet);
                            if (layoutParamsGenerateLayoutParams != null) {
                                viewM36354a.setLayoutParams(layoutParamsGenerateLayoutParams);
                            }
                        }
                        m36352b(layout, viewM36354a, attributeSetAsAttributeSet);
                        viewGroup.addView(viewM36354a);
                    }
                    layout.close();
                    int depth = xmlPullParser.getDepth();
                    do {
                        next2 = xmlPullParser.next();
                        if (next2 == 3 && xmlPullParser.getDepth() <= depth) {
                            return;
                        }
                    } while (next2 != 1);
                    return;
                }
                throw new InflateException(layout.getPositionDescription() + ": No start tag found!");
            } catch (Throwable th) {
                layout.close();
                throw th;
            }
        }
        throw new InflateException("<include /> can only be used inside of a ViewGroup");
    }
}
