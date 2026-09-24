package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8211d;
import com.fyber.inneractive.sdk.measurement.C8274h;
import com.fyber.inneractive.sdk.util.AbstractC9203w1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C12538u;
import com.ironsource.sdk.controller.InterfaceC12497f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.g */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8298g {

    /* JADX INFO: renamed from: a */
    public String f18531a;

    /* JADX INFO: renamed from: e */
    public C8306o f18535e;

    /* JADX INFO: renamed from: g */
    public C8313v f18537g;

    /* JADX INFO: renamed from: d */
    public final ArrayList f18534d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f18536f = 0;

    /* JADX INFO: renamed from: h */
    public final ArrayList f18538h = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final ArrayList f18532b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f18533c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m20703a(Node node) {
        C8314w c8314w;
        Node nodeM22043d = AbstractC9203w1.m22043d(node, "AdVerifications");
        if (nodeM22043d != null) {
            for (Node node2 : AbstractC9203w1.m22042c(nodeM22043d, "Verification")) {
                C8274h c8274h = null;
                if (node2 != null) {
                    C8274h c8274h2 = new C8274h();
                    c8274h2.f18454e = AbstractC9203w1.m22041b(node2, "vendor");
                    Node nodeM22043d2 = AbstractC9203w1.m22043d(node2, "JavaScriptResource");
                    if (nodeM22043d2 != null) {
                        c8274h2.f18456g = true;
                        try {
                            c8274h2.f18455f = AbstractC9203w1.m22040a(nodeM22043d2);
                            c8274h2.f18451b = AbstractC9203w1.m22041b(nodeM22043d2, "apiFramework");
                            c8274h2.f18450a = new URL(c8274h2.f18455f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node nodeM22043d3 = AbstractC9203w1.m22043d(node2, "TrackingEvents");
                    if (nodeM22043d3 != null) {
                        for (Node node3 : AbstractC9203w1.m22042c(nodeM22043d3, "Tracking")) {
                            if (node3 == null) {
                                c8314w = null;
                            } else {
                                c8314w = new C8314w();
                                c8314w.f18582a = AbstractC9203w1.m22041b(node3, NotificationCompat.CATEGORY_EVENT);
                                c8314w.f18583b = AbstractC9203w1.m22040a(node3);
                                c8314w.f18584c = AbstractC9203w1.m22041b(node3, TypedValues.CycleType.S_WAVE_OFFSET);
                            }
                            if (node3 != null && c8314w.f18582a.equalsIgnoreCase("verificationNotExecuted")) {
                                c8274h2.m20677a(EnumC8315x.EVENT_VERIFICATION_NOT_EXECUTED, c8314w.f18583b);
                            }
                        }
                    }
                    Node nodeM22043d4 = AbstractC9203w1.m22043d(node2, "VerificationParameters");
                    if (nodeM22043d4 != null) {
                        c8274h2.f18453d = AbstractC9203w1.m22040a(nodeM22043d4);
                    }
                    c8274h = c8274h2;
                }
                if (c8274h != null) {
                    IAlog.m21945a("Verification Found - %s", c8274h.toString());
                    this.f18534d.add(c8274h);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m20704b(Node node) {
        Node nodeM22043d;
        NodeList childNodes;
        NodeList childNodes2;
        C8304m c8304m;
        C8299h c8299h;
        C8314w c8314w;
        C8314w c8314w2;
        C8309r c8309r;
        AbstractC8298g abstractC8298g = this;
        Node nodeM22043d2 = AbstractC9203w1.m22043d(node, "AdSystem");
        if (nodeM22043d2 != null) {
            AbstractC9203w1.m22041b(nodeM22043d2, "version");
            AbstractC9203w1.m22040a(nodeM22043d2);
        }
        Node nodeM22043d3 = AbstractC9203w1.m22043d(node, "Error");
        if (nodeM22043d3 != null) {
            String strM22040a = AbstractC9203w1.m22040a(nodeM22043d3);
            if (!TextUtils.isEmpty(strM22040a)) {
                abstractC8298g.f18531a = strM22040a;
            }
        }
        Iterator it = AbstractC9203w1.m22042c(node, "Impression").iterator();
        while (it.hasNext()) {
            String strM22040a2 = AbstractC9203w1.m22040a((Node) it.next());
            if (!TextUtils.isEmpty(strM22040a2)) {
                abstractC8298g.f18532b.add(strM22040a2);
            }
        }
        Node nodeM22043d4 = AbstractC9203w1.m22043d(node, "Creatives");
        if (nodeM22043d4 != null) {
            Iterator it2 = AbstractC9203w1.m22042c(nodeM22043d4, "Creative").iterator();
            while (it2.hasNext()) {
                Node node2 = (Node) it2.next();
                if (node2 == null) {
                    it2 = it2;
                    c8304m = null;
                } else {
                    c8304m = new C8304m();
                    if (TextUtils.isEmpty(AbstractC9203w1.m22041b(node2, "AdID"))) {
                        AbstractC9203w1.m22041b(node2, InterfaceC12497f.b.f32089c);
                    }
                    AbstractC9203w1.m22041b(node2, "id");
                    AbstractC9203w1.m22039a(node2, "sequence");
                    Node nodeM22043d5 = AbstractC9203w1.m22043d(node2, "Linear");
                    if (nodeM22043d5 != null) {
                        C8308q c8308q = new C8308q();
                        Node nodeM22043d6 = AbstractC9203w1.m22043d(nodeM22043d5, "MediaFiles");
                        if (nodeM22043d6 != null) {
                            ArrayList arrayListM22042c = AbstractC9203w1.m22042c(nodeM22043d6, "MediaFile");
                            if (!arrayListM22042c.isEmpty()) {
                                c8308q.f18559a = new ArrayList();
                                for (Iterator it3 = arrayListM22042c.iterator(); it3.hasNext(); it3 = it3) {
                                    Node node3 = (Node) it3.next();
                                    if (node3 == null) {
                                        c8309r = null;
                                    } else {
                                        c8309r = new C8309r();
                                        c8309r.f18564a = AbstractC9203w1.m22041b(node3, C12538u.f32486g);
                                        c8309r.f18565b = AbstractC9203w1.m22039a(node3, "width");
                                        c8309r.f18566c = AbstractC9203w1.m22039a(node3, "height");
                                        c8309r.f18567d = AbstractC9203w1.m22041b(node3, "type");
                                        AbstractC9203w1.m22041b(node3, "id");
                                        c8309r.f18569f = AbstractC9203w1.m22041b(node3, "apiFramework");
                                        c8309r.f18568e = AbstractC9203w1.m22039a(node3, "bitrate");
                                        String strM22041b = AbstractC9203w1.m22041b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(strM22041b)) {
                                            try {
                                                Boolean.valueOf(strM22041b);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String strM22041b2 = AbstractC9203w1.m22041b(node3, "scalable");
                                        if (!TextUtils.isEmpty(strM22041b2)) {
                                            try {
                                                Boolean.valueOf(strM22041b2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        c8309r.f18570g = AbstractC9203w1.m22040a(node3);
                                    }
                                    if (c8309r != null) {
                                        c8308q.f18559a.add(c8309r);
                                    }
                                }
                            }
                        }
                        Node nodeM22043d7 = AbstractC9203w1.m22043d(nodeM22043d5, "VideoClicks");
                        if (nodeM22043d7 != null) {
                            c8308q.f18561c = AbstractC9203w1.m22040a(AbstractC9203w1.m22043d(nodeM22043d7, "ClickThrough"));
                            ArrayList arrayListM22042c2 = AbstractC9203w1.m22042c(nodeM22043d7, "ClickTracking");
                            if (!arrayListM22042c2.isEmpty()) {
                                c8308q.f18562d = new ArrayList();
                                Iterator it4 = arrayListM22042c2.iterator();
                                while (it4.hasNext()) {
                                    String strM22040a3 = AbstractC9203w1.m22040a((Node) it4.next());
                                    if (!TextUtils.isEmpty(strM22040a3)) {
                                        c8308q.f18562d.add(strM22040a3);
                                    }
                                }
                            }
                        }
                        Node nodeM22043d8 = AbstractC9203w1.m22043d(nodeM22043d5, "TrackingEvents");
                        if (nodeM22043d8 != null) {
                            ArrayList arrayListM22042c3 = AbstractC9203w1.m22042c(nodeM22043d8, "Tracking");
                            if (!arrayListM22042c3.isEmpty()) {
                                c8308q.f18560b = new ArrayList();
                                for (Iterator it5 = arrayListM22042c3.iterator(); it5.hasNext(); it5 = it5) {
                                    Node node4 = (Node) it5.next();
                                    if (node4 == null) {
                                        c8314w2 = null;
                                    } else {
                                        c8314w2 = new C8314w();
                                        c8314w2.f18582a = AbstractC9203w1.m22041b(node4, NotificationCompat.CATEGORY_EVENT);
                                        c8314w2.f18583b = AbstractC9203w1.m22040a(node4);
                                        c8314w2.f18584c = AbstractC9203w1.m22041b(node4, TypedValues.CycleType.S_WAVE_OFFSET);
                                    }
                                    if (c8314w2 != null) {
                                        c8308q.f18560b.add(c8314w2);
                                    }
                                }
                            }
                        }
                        Node nodeM22043d9 = AbstractC9203w1.m22043d(nodeM22043d5, "Duration");
                        if (nodeM22043d9 != null) {
                            c8308q.f18563e = AbstractC9203w1.m22040a(nodeM22043d9);
                        }
                        c8304m.f18552a = c8308q;
                    }
                    Node nodeM22043d10 = AbstractC9203w1.m22043d(node2, "CompanionAds");
                    if (nodeM22043d10 != null) {
                        C8301j c8301j = new C8301j();
                        String strM22041b3 = AbstractC9203w1.m22041b(nodeM22043d10, "required");
                        if (!"all".equalsIgnoreCase(strM22041b3)) {
                            "none".equalsIgnoreCase(strM22041b3);
                        }
                        ArrayList arrayListM22042c4 = AbstractC9203w1.m22042c(nodeM22043d10, "Companion");
                        c8301j.f18549a.clear();
                        Iterator it6 = arrayListM22042c4.iterator();
                        while (it6.hasNext()) {
                            Node node5 = (Node) it6.next();
                            if (node5 == null) {
                                it6 = it6;
                                c8299h = null;
                            } else {
                                c8299h = new C8299h();
                                c8299h.f18539a = AbstractC9203w1.m22039a(node5, "width");
                                c8299h.f18540b = AbstractC9203w1.m22039a(node5, "height");
                                c8299h.f18541c = AbstractC9203w1.m22041b(node5, "id");
                                AbstractC9203w1.m22041b(node5, "apiFramework");
                                AbstractC9203w1.m22039a(node5, "expandedWidth");
                                AbstractC9203w1.m22039a(node5, "expandedHeight");
                                Node nodeM22043d11 = AbstractC9203w1.m22043d(node5, "StaticResource");
                                if (nodeM22043d11 != null) {
                                    C8303l c8303l = new C8303l();
                                    c8303l.f18550a = AbstractC9203w1.m22041b(nodeM22043d11, "creativeType");
                                    c8303l.f18551b = AbstractC9203w1.m22040a(nodeM22043d11);
                                    c8299h.f18542d = c8303l;
                                }
                                Node nodeM22043d12 = AbstractC9203w1.m22043d(node5, "HTMLResource");
                                if (nodeM22043d12 != null) {
                                    c8299h.f18544f = AbstractC9203w1.m22040a(nodeM22043d12);
                                }
                                Node nodeM22043d13 = AbstractC9203w1.m22043d(node5, "IFrameResource");
                                if (nodeM22043d13 != null) {
                                    c8299h.f18543e = AbstractC9203w1.m22040a(nodeM22043d13);
                                }
                                Node nodeM22043d14 = AbstractC9203w1.m22043d(node5, "CompanionClickThrough");
                                if (nodeM22043d14 != null) {
                                    c8299h.f18545g = AbstractC9203w1.m22040a(nodeM22043d14);
                                }
                                c8299h.f18546h.clear();
                                ArrayList arrayListM22042c5 = AbstractC9203w1.m22042c(node5, "CompanionClickTracking");
                                if (arrayListM22042c5.size() > 0) {
                                    Iterator it7 = arrayListM22042c5.iterator();
                                    while (it7.hasNext()) {
                                        String strM22040a4 = AbstractC9203w1.m22040a((Node) it7.next());
                                        if (!TextUtils.isEmpty(strM22040a4)) {
                                            c8299h.f18546h.add(strM22040a4);
                                        }
                                    }
                                }
                                c8299h.f18548j.clear();
                                Node nodeM22043d15 = AbstractC9203w1.m22043d(node5, "TrackingEvents");
                                if (nodeM22043d15 != null) {
                                    ArrayList<Node> arrayListM22042c6 = AbstractC9203w1.m22042c(nodeM22043d15, "Tracking");
                                    if (!arrayListM22042c6.isEmpty()) {
                                        for (Node node6 : arrayListM22042c6) {
                                            if (node6 == null) {
                                                c8314w = null;
                                            } else {
                                                c8314w = new C8314w();
                                                c8314w.f18582a = AbstractC9203w1.m22041b(node6, NotificationCompat.CATEGORY_EVENT);
                                                c8314w.f18583b = AbstractC9203w1.m22040a(node6);
                                                c8314w.f18584c = AbstractC9203w1.m22041b(node6, TypedValues.CycleType.S_WAVE_OFFSET);
                                            }
                                            if (c8314w != null) {
                                                c8299h.f18548j.add(c8314w);
                                            }
                                        }
                                    }
                                }
                            }
                            if (c8299h != null) {
                                c8301j.f18549a.add(c8299h);
                            }
                            it6 = it6;
                        }
                        c8304m.f18553b = c8301j;
                    }
                }
                abstractC8298g = this;
                if (c8304m != null) {
                    abstractC8298g.f18533c.add(c8304m);
                }
                it2 = it2;
            }
        }
        Node nodeM22043d16 = AbstractC9203w1.m22043d(node, "Extensions");
        if (nodeM22043d16 != null) {
            for (Node node7 : AbstractC9203w1.m22042c(nodeM22043d16, "Extension")) {
                if ("AdVerifications".equalsIgnoreCase(AbstractC9203w1.m22041b(node7, "type"))) {
                    abstractC8298g.m20703a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(AbstractC9203w1.m22041b(node7, "type"))) {
                    IAlog.m21945a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node nodeM22043d17 = AbstractC9203w1.m22043d(node7, "FMPCompanionAssets");
                    if (nodeM22043d17 != null) {
                        C8306o c8306o = new C8306o();
                        String strM22041b4 = AbstractC9203w1.m22041b(nodeM22043d17, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(strM22041b4) || "0".equals(strM22041b4)) {
                            c8306o.f18558d = false;
                        }
                        Node nodeM22043d18 = AbstractC9203w1.m22043d(nodeM22043d17, "Name");
                        if (nodeM22043d18 != null) {
                            c8306o.f18555a = AbstractC9203w1.m22040a(nodeM22043d18);
                        }
                        Node nodeM22043d19 = AbstractC9203w1.m22043d(nodeM22043d17, "Description");
                        if (nodeM22043d19 != null) {
                            AbstractC9203w1.m22040a(nodeM22043d19);
                        }
                        c8306o.f18556b.clear();
                        Node nodeM22043d20 = AbstractC9203w1.m22043d(nodeM22043d17, "Icons");
                        if (nodeM22043d20 != null) {
                            Iterator it8 = AbstractC9203w1.m22042c(nodeM22043d20, "Icon").iterator();
                            while (it8.hasNext()) {
                                c8306o.f18556b.add(AbstractC9203w1.m22040a((Node) it8.next()));
                            }
                        }
                        Node nodeM22043d21 = AbstractC9203w1.m22043d(nodeM22043d17, "Rating");
                        if (nodeM22043d21 != null) {
                            try {
                                Float.parseFloat(AbstractC9203w1.m22040a(nodeM22043d21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node nodeM22043d22 = AbstractC9203w1.m22043d(nodeM22043d17, "Screenshots");
                        if (nodeM22043d22 != null) {
                            c8306o.f18557c = new ArrayList();
                            Iterator it9 = AbstractC9203w1.m22042c(nodeM22043d22, "Screenshot").iterator();
                            while (it9.hasNext()) {
                                String strM22040a5 = AbstractC9203w1.m22040a((Node) it9.next());
                                if (!TextUtils.isEmpty(strM22040a5)) {
                                    c8306o.f18557c.add(strM22040a5);
                                }
                            }
                        }
                        abstractC8298g.f18535e = c8306o;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(AbstractC9203w1.m22041b(node7, "type"))) {
                    Node nodeM22043d23 = AbstractC9203w1.m22043d(node7, "DynamicVideoControlsURL");
                    C8305n c8305n = new C8305n();
                    if (nodeM22043d23 != null) {
                        c8305n.f18554a = AbstractC9203w1.m22040a(nodeM22043d23);
                    }
                    if (!TextUtils.isEmpty(c8305n.f18554a)) {
                        abstractC8298g.f18538h.add(c8305n);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(AbstractC9203w1.m22041b(node7, "type")) && (nodeM22043d = AbstractC9203w1.m22043d(node7, "DTSPR")) != null) {
                    C8313v c8313v = new C8313v();
                    Node nodeM22043d24 = AbstractC9203w1.m22043d(nodeM22043d, "DTSPNm");
                    if (nodeM22043d24 != null) {
                        c8313v.f18574b = AbstractC9203w1.m22040a(nodeM22043d24);
                    }
                    Node nodeM22043d25 = AbstractC9203w1.m22043d(nodeM22043d, "DTSPTUrl");
                    if (nodeM22043d25 != null) {
                        c8313v.f18575c = AbstractC9203w1.m22040a(nodeM22043d25);
                    }
                    Node nodeM22043d26 = AbstractC9203w1.m22043d(nodeM22043d, "DTSPPNm");
                    if (nodeM22043d26 != null) {
                        c8313v.f18581i = AbstractC9203w1.m22040a(nodeM22043d26);
                    }
                    Node nodeM22043d27 = AbstractC9203w1.m22043d(nodeM22043d, "DTSPIap");
                    if (nodeM22043d27 != null) {
                        c8313v.f18576d = AbstractC9203w1.m22040a(nodeM22043d27);
                    }
                    Node nodeM22043d28 = AbstractC9203w1.m22043d(nodeM22043d, "DTSPCads");
                    if (nodeM22043d28 != null) {
                        c8313v.f18577e = AbstractC9203w1.m22040a(nodeM22043d28);
                    }
                    Node nodeM22043d29 = AbstractC9203w1.m22043d(nodeM22043d, "DTSPMedia");
                    if (nodeM22043d29 != null && (childNodes2 = nodeM22043d29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i = 0; i < childNodes2.getLength(); i++) {
                            Node nodeItem = childNodes2.item(i);
                            if (nodeItem != null) {
                                String nodeName = nodeItem.getNodeName();
                                String strM22040a6 = AbstractC9203w1.m22040a(nodeItem);
                                if (!TextUtils.isEmpty(strM22040a6)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        c8313v.f18578f.add(strM22040a6);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        c8313v.f18579g.add(strM22040a6);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        c8313v.f18573a = strM22040a6;
                                    }
                                }
                            }
                        }
                    }
                    Node nodeM22043d30 = AbstractC9203w1.m22043d(nodeM22043d, "DTSPMetadata");
                    if (nodeM22043d30 != null && (childNodes = nodeM22043d30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String strM22040a7 = null;
                        String strM22040a8 = null;
                        String strM22040a9 = null;
                        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                            Node nodeItem2 = childNodes.item(i2);
                            if (nodeItem2 != null) {
                                String nodeName2 = nodeItem2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    strM22040a7 = AbstractC9203w1.m22040a(nodeItem2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    strM22040a8 = AbstractC9203w1.m22040a(nodeItem2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    strM22040a9 = AbstractC9203w1.m22040a(nodeItem2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strM22040a7) && !TextUtils.isEmpty(strM22040a8) && !TextUtils.isEmpty(strM22040a9)) {
                            c8313v.f18580h = new C8211d(strM22040a8, strM22040a7, strM22040a9);
                        }
                    }
                    abstractC8298g.f18537g = c8313v;
                }
            }
        }
        m20703a(node);
    }
}
