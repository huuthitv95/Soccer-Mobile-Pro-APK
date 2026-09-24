package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import bolts.MeasurementEvent;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a */
/* JADX INFO: compiled from: TouchEventData.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12885a {

    /* JADX INFO: renamed from: a */
    private float f34632a;

    /* JADX INFO: renamed from: b */
    private float f34633b;

    /* JADX INFO: renamed from: c */
    private float f34634c;

    /* JADX INFO: renamed from: d */
    private float f34635d;

    /* JADX INFO: renamed from: e */
    private float f34636e;

    /* JADX INFO: renamed from: f */
    private float f34637f;

    /* JADX INFO: renamed from: g */
    private long f34638g;

    /* JADX INFO: renamed from: h */
    private long f34639h;

    /* JADX INFO: renamed from: i */
    private float f34640i;

    /* JADX INFO: renamed from: j */
    private float f34641j;

    /* JADX INFO: renamed from: k */
    private float f34642k;

    /* JADX INFO: renamed from: l */
    private int f34643l;

    /* JADX INFO: renamed from: m */
    private int f34644m;

    /* JADX INFO: renamed from: n */
    private int f34645n;

    /* JADX INFO: renamed from: o */
    private View f34646o;

    /* JADX INFO: renamed from: p */
    private final List<a> f34647p = new ArrayList();

    /* JADX INFO: renamed from: q */
    private int f34648q = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a */
    /* JADX INFO: compiled from: TouchEventData.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f34649a;

        /* JADX INFO: renamed from: b */
        public final float f34650b;

        /* JADX INFO: renamed from: c */
        public final float f34651c;

        /* JADX INFO: renamed from: d */
        public final float f34652d;

        /* JADX INFO: renamed from: e */
        public final float f34653e;

        /* JADX INFO: renamed from: f */
        public final float f34654f;

        /* JADX INFO: renamed from: g */
        public final int f34655g;

        public a(int i, float f, float f2, float f3, float f4, float f5, int i2) {
            this.f34649a = i;
            this.f34650b = f;
            this.f34651c = f2;
            this.f34652d = f3;
            this.f34653e = f4;
            this.f34654f = f5;
            this.f34655g = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    private float m35968a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    /* JADX INFO: renamed from: b */
    private float m35971b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    /* JADX INFO: renamed from: g */
    private void m35976g(MotionEvent motionEvent) {
        this.f34647p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f34648q = 1;
            this.f34647p.add(new a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f34648q = motionEvent.getPointerCount();
            for (int i = 0; i < this.f34648q; i++) {
                this.f34647p.add(new a(motionEvent.getPointerId(i), motionEvent.getRawX(i), motionEvent.getRawY(i), motionEvent.getPressure(i), motionEvent.getSize(i), motionEvent.getOrientation(i), motionEvent.getToolType(i)));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m35977h(MotionEvent motionEvent) {
        this.f34640i = motionEvent.getPressure();
        this.f34641j = motionEvent.getSize();
        this.f34642k = motionEvent.getOrientation();
        this.f34643l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    /* JADX INFO: renamed from: c */
    public void m35981c(MotionEvent motionEvent) {
        m35976g(motionEvent);
    }

    /* JADX INFO: renamed from: d */
    public void m35983d(MotionEvent motionEvent) {
        this.f34632a = m35968a(motionEvent);
        this.f34633b = m35971b(motionEvent);
        this.f34638g = System.currentTimeMillis();
        m35977h(motionEvent);
        m35976g(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m35984e(MotionEvent motionEvent) {
        this.f34634c = m35968a(motionEvent);
        this.f34635d = m35971b(motionEvent);
        m35977h(motionEvent);
        m35976g(motionEvent);
    }

    /* JADX INFO: renamed from: f */
    public void m35985f(MotionEvent motionEvent) {
        this.f34636e = m35968a(motionEvent);
        this.f34637f = m35971b(motionEvent);
        this.f34639h = System.currentTimeMillis();
        m35977h(motionEvent);
        m35976g(motionEvent);
    }

    /* JADX INFO: renamed from: c */
    public void m35982c(View view) {
        this.f34646o = view;
        this.f34644m = view.getWidth();
        this.f34645n = view.getHeight();
    }

    /* JADX INFO: renamed from: b */
    private void m35973b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f34647p) {
            HashMap map2 = new HashMap();
            map2.put("x", String.valueOf(aVar.f34650b));
            map2.put("y", String.valueOf(aVar.f34651c));
            map2.put("pressure", String.valueOf(aVar.f34652d));
            map2.put("size", String.valueOf(aVar.f34653e));
            map2.put("id", Integer.valueOf(aVar.f34649a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    /* JADX INFO: renamed from: c */
    private void m35974c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f34632a));
        map.put("down_y", Float.valueOf(this.f34633b));
        map.put("down_time", Long.valueOf(this.f34638g));
        map.put("up_x", Float.valueOf(this.f34636e));
        map.put("up_y", Float.valueOf(this.f34637f));
        map.put("up_time", Long.valueOf(this.f34639h));
    }

    /* JADX INFO: renamed from: a */
    public HashMap<String, Object> m35978a() {
        HashMap<String, Object> map = new HashMap<>();
        m35970a(map);
        m35973b(map);
        m35975d(map);
        m35974c(map);
        return map;
    }

    /* JADX INFO: renamed from: d */
    private void m35975d(HashMap<String, Object> map) {
        View view = this.f34646o;
        if (view != null) {
            map.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME, view.getClass().getSimpleName());
            String strM35972b = m35972b(this.f34646o);
            map.put("resource_id", strM35972b);
            String strM35969a = m35969a(this.f34646o);
            map.put("content_desc", strM35969a);
            map.put("view_format", String.format("%s#%s(%s)", this.f34646o.getClass().getSimpleName(), strM35972b, strM35969a));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m35980c() {
        this.f34637f = 0.0f;
        this.f34636e = 0.0f;
        this.f34635d = 0.0f;
        this.f34634c = 0.0f;
        this.f34633b = 0.0f;
        this.f34632a = 0.0f;
        this.f34639h = 0L;
        this.f34638g = 0L;
        this.f34642k = 0.0f;
        this.f34641j = 0.0f;
        this.f34640i = 0.0f;
        this.f34643l = 0;
        this.f34645n = 0;
        this.f34644m = 0;
        this.f34646o = null;
        this.f34648q = 0;
        this.f34647p.clear();
    }

    /* JADX INFO: renamed from: a */
    private void m35970a(HashMap<String, Object> map) {
        map.put(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f34638g));
    }

    /* JADX INFO: renamed from: b */
    private String m35972b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    private String m35969a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    /* JADX INFO: renamed from: b */
    public a m35979b() {
        if (this.f34647p.isEmpty()) {
            return null;
        }
        return this.f34647p.get(0);
    }
}
