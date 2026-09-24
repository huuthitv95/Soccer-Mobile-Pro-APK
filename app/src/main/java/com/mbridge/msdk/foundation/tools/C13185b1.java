package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.b1 */
/* JADX INFO: compiled from: TouchEventReporter.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13185b1 {

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.b1$a */
    /* JADX INFO: compiled from: TouchEventReporter.java */
    class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        JSONArray f36246a = new JSONArray();

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f36247b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f36248c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ View.OnTouchListener f36249d;

        a(View view, String str, View.OnTouchListener onTouchListener) {
            this.f36247b = view;
            this.f36248c = str;
            this.f36249d = onTouchListener;
        }

        /* JADX INFO: renamed from: a */
        private void m37637a() {
            this.f36246a = new JSONArray();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                C13185b1.m37636b(this.f36246a, motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m37637a();
                C13185b1.m37636b(this.f36246a, motionEvent);
                C13185b1.m37635b(this.f36247b, motionEvent, this.f36246a, this.f36248c);
            } else if (actionMasked == 1) {
                C13185b1.m37635b(this.f36247b, motionEvent, this.f36246a, this.f36248c);
                m37637a();
            } else if (actionMasked == 3) {
                m37637a();
            }
            View.OnTouchListener onTouchListener = this.f36249d;
            if (onTouchListener == null) {
                return false;
            }
            onTouchListener.onTouch(view, motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m37635b(View view, MotionEvent motionEvent, JSONArray jSONArray, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetView", m37630a(view, motionEvent));
            jSONObject.put("eventList", jSONArray);
        } catch (JSONException e) {
            Log.e("TouchEventReporter", "JSON build error", e);
        }
        C13154c c13154cM37489b = C13156d.m37475b().m37489b(str);
        if (c13154cM37489b != null) {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("eventList", jSONObject);
            c13154cM37489b.m37428b("m_check_local_c", c13157e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37632a(View view, String str, int i) {
        m37633a(view, str, i, (View.OnTouchListener) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m37633a(View view, String str, int i, View.OnTouchListener onTouchListener) {
        if (i != 0) {
            if (view == null) {
                return;
            }
            view.setOnTouchListener(new a(view, str, onTouchListener));
            return;
        }
        try {
            C13154c c13154cM37489b = C13156d.m37475b().m37489b(str);
            if (c13154cM37489b != null) {
                c13154cM37489b.m37419a(c13154cM37489b.m37463t() + "m_check_local_c");
            }
        } catch (Exception e) {
            C13219q0.m37816b("TouchEventReporter", e.getMessage());
        }
        if (onTouchListener == null || view == null) {
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m37636b(JSONArray jSONArray, MotionEvent motionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C11744X3.i.f26373j0, m37628a(motionEvent));
            jSONObject.put("eventTime", String.valueOf(motionEvent.getEventTime()));
            jSONObject.put("downTime", String.valueOf(motionEvent.getDownTime()));
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                JSONObject jSONObject2 = new JSONObject();
                if (Build.VERSION.SDK_INT >= 29) {
                    jSONObject2.put("x", String.valueOf(motionEvent.getRawX(i)));
                    jSONObject2.put("y", String.valueOf(motionEvent.getRawY(i)));
                } else {
                    jSONObject2.put("x", String.valueOf(motionEvent.getRawX()));
                    jSONObject2.put("y", String.valueOf(motionEvent.getRawY()));
                }
                jSONObject2.put("pressure", String.valueOf(motionEvent.getPressure(i)));
                jSONObject2.put("size", String.valueOf(motionEvent.getSize(i)));
                jSONObject2.put("id", motionEvent.getPointerId(i));
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("point", jSONArray2);
            jSONArray.put(jSONObject);
        } catch (Exception e) {
            Log.e("TouchEventReporter", "collectEvent JSON error", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m37630a(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (view instanceof ViewGroup) {
            view = m37627a((ViewGroup) view, (int) rawX, (int) rawY);
        }
        return m37629a(view);
    }

    /* JADX INFO: renamed from: a */
    private static String m37628a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return "down";
        }
        if (actionMasked == 1) {
            return "up";
        }
        if (actionMasked == 2) {
            return "move";
        }
        if (actionMasked == 3) {
            return "cancel";
        }
        if (actionMasked == 5) {
            return "pointer_down_" + motionEvent.getPointerId(motionEvent.getActionIndex());
        }
        if (actionMasked != 6) {
            return "other_" + motionEvent.getActionMasked();
        }
        return "pointer_up_" + motionEvent.getPointerId(motionEvent.getActionIndex());
    }

    /* JADX INFO: renamed from: a */
    private static View m37627a(ViewGroup viewGroup, int i, int i2) {
        View viewM37627a;
        int[] iArr = new int[2];
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                int width = childAt.getWidth() + i3;
                int height = childAt.getHeight() + i4;
                if (i >= i3 && i <= width && i2 >= i4 && i2 <= height) {
                    return (!(childAt instanceof ViewGroup) || (viewM37627a = m37627a((ViewGroup) childAt, i, i2)) == null) ? childAt : viewM37627a;
                }
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: a */
    private static String m37629a(View view) {
        String resourceEntryName;
        if (view == null) {
            return "UnknownView";
        }
        try {
            resourceEntryName = view.getId() != -1 ? view.getResources().getResourceEntryName(view.getId()) : "";
        } catch (Exception unused) {
        }
        return view.getClass().getSimpleName() + "#" + resourceEntryName + "#" + (view.getContentDescription() != null ? view.getContentDescription().toString() : "");
    }
}
