package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.p289db.BatchReportDao;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.report.net.AbstractC13161b;
import com.mbridge.msdk.foundation.same.report.net.C13160a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.setting.C13629a;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13826m;
import com.mbridge.msdk.tracker.C13873p;
import com.mbridge.msdk.tracker.C13881x;
import com.mbridge.msdk.tracker.network.toolbox.C13858h;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.e */
/* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C13143e {

    /* JADX INFO: renamed from: l */
    private static final String f36097l = "e";

    /* JADX INFO: renamed from: m */
    private static String f36098m = "roas";

    /* JADX INFO: renamed from: n */
    private static volatile C13143e f36099n;

    /* JADX INFO: renamed from: a */
    private AtomicInteger f36100a;

    /* JADX INFO: renamed from: b */
    private BatchReportDao f36101b;

    /* JADX INFO: renamed from: c */
    private int f36102c = 1;

    /* JADX INFO: renamed from: d */
    private long f36103d = 0;

    /* JADX INFO: renamed from: e */
    private String f36104e = C13121d.m37226h().f36006O;

    /* JADX INFO: renamed from: f */
    private volatile int f36105f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f36106g = false;

    /* JADX INFO: renamed from: h */
    private Executor f36107h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i */
    private Handler f36108i;

    /* JADX INFO: renamed from: j */
    private Stack<Long> f36109j;

    /* JADX INFO: renamed from: k */
    private C13826m f36110k;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.e$a */
    /* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Bundle data = message.getData();
                if (C13143e.this.f36108i == null || C13143e.this.f36101b == null || data == null) {
                    return;
                }
                C13143e.this.f36108i.removeMessages(2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<BatchReportMessage> batchReportMessages = C13143e.this.f36101b.getBatchReportMessages(jCurrentTimeMillis, 2);
                C13143e.this.m37342b(batchReportMessages, jCurrentTimeMillis);
                C13143e.this.f36100a.set(0);
                String str = C13143e.f36097l;
                StringBuilder sb = new StringBuilder("超时上报触发了，需要上报的数据： ");
                sb.append(batchReportMessages != null ? batchReportMessages.size() : 0);
                C13219q0.m37813a(str, sb.toString());
                return;
            }
            if (i == 2) {
                Bundle data2 = message.getData();
                if (C13143e.this.f36108i == null || C13143e.this.f36101b == null || data2 == null) {
                    return;
                }
                C13143e.this.f36108i.removeMessages(1);
                long j = data2.getLong("last_report_time");
                ArrayList<BatchReportMessage> batchReportMessages2 = C13143e.this.f36101b.getBatchReportMessages(j, 2);
                C13143e.this.m37342b(batchReportMessages2, j);
                String str2 = C13143e.f36097l;
                StringBuilder sb2 = new StringBuilder("队列上报触发了，需要上报的数据： ");
                sb2.append(batchReportMessages2 != null ? batchReportMessages2.size() : 0);
                C13219q0.m37813a(str2, sb2.toString());
                return;
            }
            if (i == 3) {
                Bundle data3 = message.getData();
                if (data3 != null) {
                    C13143e.this.m37339a((ArrayList<BatchReportMessage>) data3.getParcelableArrayList("report_message"), data3.getLong("last_report_time"));
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            Bundle data4 = message.getData();
            if (C13143e.this.f36108i == null || C13143e.this.f36101b == null || data4 == null || !C13143e.this.f36106g) {
                return;
            }
            C13143e.this.f36108i.removeMessages(4);
            ArrayList<BatchReportMessage> batchReportMessages3 = C13143e.this.f36101b.getBatchReportMessages(System.currentTimeMillis(), 2);
            if (batchReportMessages3 != null && batchReportMessages3.size() > 0) {
                for (int i2 = 0; i2 < batchReportMessages3.size(); i2++) {
                    BatchReportMessage batchReportMessage = batchReportMessages3.get(i2);
                    C13143e.this.m37338a(batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                }
            }
            String str3 = C13143e.f36097l;
            StringBuilder sb3 = new StringBuilder("切换上报lib，需要上报的数据： ");
            sb3.append(batchReportMessages3 != null ? batchReportMessages3.size() : 0);
            C13219q0.m37813a(str3, sb3.toString());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.e$b */
    /* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
    class b extends AbstractC13161b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f36112b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ArrayList f36113c;

        b(long j, ArrayList arrayList) {
            this.f36112b = j;
            this.f36113c = arrayList;
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.AbstractC13161b
        /* JADX INFO: renamed from: a */
        public void mo37352a(String str) {
            Stack stack;
            C13219q0.m37813a(C13143e.f36097l, "批量上报失败： " + str);
            C13143e.this.m37333a(2, str);
            synchronized (C13143e.this.f36109j) {
                C13143e.this.f36109j.add(Long.valueOf(this.f36112b));
                if (C13143e.this.f36101b != null) {
                    C13143e.this.f36101b.updateMessagesReportState(this.f36113c);
                }
                if (C13143e.this.f36109j.size() >= 5) {
                    C13219q0.m37813a(C13143e.f36097l, "批量上报失败，上报失败的数据超过阈值");
                    try {
                        try {
                            C13143e.this.f36109j.pop();
                            long jLongValue = ((Long) C13143e.this.f36109j.pop()).longValue();
                            C13143e.this.f36109j.clear();
                            if (C13143e.this.f36101b != null) {
                                C13143e.this.f36101b.deleteBatchReportMessagesByTimestamp(jLongValue);
                            }
                            stack = C13143e.this.f36109j;
                        } catch (Exception e) {
                            C13219q0.m37816b(C13143e.f36097l, e.getMessage());
                            stack = C13143e.this.f36109j;
                        }
                        stack.clear();
                    } catch (Throwable th) {
                        C13143e.this.f36109j.clear();
                        throw th;
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.AbstractC13161b
        /* JADX INFO: renamed from: b */
        public void mo37353b(String str) {
            C13219q0.m37813a(C13143e.f36097l, "批量上报成功");
            C13143e.this.m37333a(1, "");
            try {
                if (C13143e.this.f36101b != null) {
                    C13143e.this.f36101b.deleteBatchReportMessagesByTimestamp(this.f36112b);
                }
            } catch (Exception e) {
                C13219q0.m37816b(C13143e.f36097l, e.getMessage());
            }
            synchronized (C13143e.this.f36109j) {
                C13143e.this.f36109j.clear();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.e$c */
    /* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36115a;

        c(String str) {
            this.f36115a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C13143e.this.f36101b == null) {
                return;
            }
            C13219q0.m37813a(C13143e.f36097l, "接收到上报数据： " + this.f36115a);
            if (!C13143e.this.f36106g) {
                if (C13143e.this.f36105f != 1) {
                    C13143e.this.m37345c(this.f36115a);
                }
            } else {
                C13143e.this.m37338a(this.f36115a, 0L);
                if (((Integer) C13235y0.m37956a(C13008c.m36588n().m36542d(), "roas_use_event", 0)).intValue() == 0) {
                    C13235y0.m37957b(C13008c.m36588n().m36542d(), "roas_use_event", 1);
                    C13143e.this.f36108i.sendEmptyMessage(4);
                }
            }
        }
    }

    private C13143e() {
        m37347d();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C13143e m37344c() {
        if (f36099n == null) {
            f36099n = new C13143e();
        }
        return f36099n;
    }

    /* JADX INFO: renamed from: d */
    private void m37347d() {
        C13629a c13629aM39523j;
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d != null && (c13629aM39523j = c13635gM39718d.m39523j()) != null) {
            this.f36102c = c13629aM39523j.m39366a();
            this.f36103d = ((long) c13629aM39523j.m39371c()) * 1000;
            this.f36104e = C13121d.m37226h().f36006O;
            this.f36105f = c13629aM39523j.m39368b();
            boolean z = c13629aM39523j.m39374d() == 1;
            this.f36106g = z;
            if (z && this.f36105f != 1) {
                int iM37844b = C13223s0.m37831a().m37844b("bcp", "type", C13223s0.m37831a().m37843b("t_r_t", 1));
                if (iM37844b != 0 && iM37844b != 1) {
                    iM37844b = 0;
                }
                this.f36110k = C13826m.m41070b(f36098m, C13008c.m36588n().m36542d(), new C13881x.b().m41403a(new C13142d()).m41405a(new C13159n()).m41402a(iM37844b, m37330a(iM37844b)).m41401a(C13223s0.m37831a().m37843b("t_m_e_t", 604800000)).m41407b(C13223s0.m37831a().m37843b("t_m_e_s", 50)).m41409d(C13223s0.m37831a().m37843b("t_m_r_c", 50)).m41408c(C13223s0.m37831a().m37843b("t_m_t", 15000)).m41410e(C13223s0.m37831a().m37843b("t_m_r_t_s", 1)).m41406a());
                JSONObject jSONObjectM37281b = C13134c.m37281b();
                try {
                    jSONObjectM37281b.put("device_type", C13211m0.m37726F(C13008c.m36588n().m36542d()) ? "pad" : "phone");
                    if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER)) {
                        jSONObjectM37281b.put(C13126e.f36059j, C13211m0.m37777w());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f36110k.m41075a(jSONObjectM37281b);
                this.f36110k.m41085h();
            }
        }
        C13219q0.m37813a(f36097l, "初始化批量上报： " + this.f36104e + " " + this.f36102c + " " + this.f36103d + " " + this.f36105f);
        this.f36100a = new AtomicInteger(0);
        this.f36109j = new Stack<>();
        this.f36101b = BatchReportDao.getInstance(C13008c.m36588n().m36542d());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.f36108i = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m37342b(ArrayList<BatchReportMessage> arrayList, long j) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j);
        messageObtain.setData(bundle);
        messageObtain.what = 3;
        this.f36108i.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m37345c(String str) {
        this.f36101b.addReportMessage(str, 2);
        Handler handler = this.f36108i;
        if (handler != null && !handler.hasMessages(1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            this.f36108i.sendMessageDelayed(messageObtain, this.f36103d);
        }
        if (this.f36100a.incrementAndGet() < this.f36102c || this.f36108i == null) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        messageObtain2.setData(bundle);
        messageObtain2.what = 2;
        this.f36108i.sendMessage(messageObtain2);
        this.f36100a.set(0);
    }

    /* JADX INFO: renamed from: a */
    private C13873p m37330a(int i) {
        if (i == 1) {
            return new C13873p(new C13151m((byte) 2), C13121d.m37226h().f36035l, C13121d.m37226h().f36039p);
        }
        return new C13873p(new C13858h(), C13121d.m37226h().f36006O, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m37339a(ArrayList<BatchReportMessage> arrayList, long j) {
        if (arrayList != null && arrayList.size() > 0) {
            C13219q0.m37813a(f36097l, "需要上报的数据条数： " + arrayList.size());
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d == null) {
                return;
            }
            C13126e c13126eM37374a = C13148j.m37374a(contextM36542d);
            c13126eM37374a.m37245a("app_id", C13008c.m36588n().m36533b());
            c13126eM37374a.m37245a("m_sdk", "msdk");
            c13126eM37374a.m37245a("lqswt", String.valueOf(1));
            c13126eM37374a.m37245a("device_type", C13211m0.m37726F(contextM36542d) ? "pad" : "phone");
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER)) {
                c13126eM37374a.m37245a(C13126e.f36059j, C13211m0.m37777w());
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    BatchReportMessage batchReportMessage = arrayList.get(i);
                    if (batchReportMessage != null) {
                        sb.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i >= 0 && i < size - 1) {
                            sb.append("\n");
                        }
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b(f36097l, th.getMessage());
                }
            }
            try {
                String strEncode = URLEncoder.encode(sb.toString(), C11341A5.f23802O);
                c13126eM37374a.m37245a("data", strEncode);
                C13219q0.m37813a(f36097l, "需要批量上报的数据： " + strEncode);
                C13160a c13160a = new C13160a(C13008c.m36588n().m36542d());
                m37333a(0, "");
                c13160a.post(0, this.f36104e, c13126eM37374a, new b(j, arrayList), "roas", 60000L);
                return;
            } catch (Exception e) {
                C13219q0.m37816b(f36097l, e.getMessage());
                return;
            }
        }
        C13219q0.m37813a(f36097l, "需要上报的数据条数： 0");
    }

    /* JADX INFO: renamed from: b */
    public void m37350b() {
        Handler handler = this.f36108i;
        if (handler == null || handler.hasMessages(1) || this.f36105f == 1 || this.f36106g) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.f36108i.sendMessageDelayed(messageObtain, 5000L);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m37351b(String str) {
        Executor executor;
        if (this.f36105f == 1) {
            return;
        }
        c cVar = new c(str);
        if (C13009d.m36589a().m36605e() && (executor = this.f36107h) != null) {
            executor.execute(cVar);
        } else {
            cVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m37338a(String str, long j) {
        if (this.f36110k != null) {
            C13818e c13818e = new C13818e("roas");
            c13818e.m41007a(true);
            if (j != 0) {
                c13818e.m41010c(j);
            }
            c13818e.m41002a(1);
            try {
                c13818e.m41006a(m37332a(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f36110k.m41081d(c13818e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m37333a(int i, String str) {
        C13157e c13157e = new C13157e();
        c13157e.m37501a("state", Integer.valueOf(i));
        if (i == 2) {
            c13157e.m37501a("reason", str);
        }
        C13154c c13154c = new C13154c();
        c13154c.m37423a("m_ad_rev_s_s", c13157e);
        C13156d.m37475b().m37484a("m_ad_rev_s_s", c13154c);
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m37332a(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (String str2 : str.split(C11744X3.j.f26436c)) {
                    String[] strArrSplit = str2.split(C11744X3.j.f26434b);
                    if (strArrSplit.length == 2) {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }
}
