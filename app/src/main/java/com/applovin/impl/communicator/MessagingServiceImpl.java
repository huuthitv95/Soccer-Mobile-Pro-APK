package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* JADX INFO: renamed from: a */
    private ScheduledThreadPoolExecutor f1299a;

    /* JADX INFO: renamed from: b */
    private final Object f1300b = new Object();

    /* JADX INFO: renamed from: c */
    private final Map f1301c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final Object f1302d = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m2236a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: a */
    private Queue m2237a(String str) {
        LinkedList linkedList;
        synchronized (this.f1302d) {
            Queue queue = (Queue) this.f1301c.get(str);
            linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: a */
    private ScheduledThreadPoolExecutor m2238a() {
        synchronized (this.f1300b) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f1299a;
            if (scheduledThreadPoolExecutor != null) {
                return scheduledThreadPoolExecutor;
            }
            return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return MessagingServiceImpl.m2236a(runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2240b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.f1302d) {
                Queue queue = (Queue) this.f1301c.get(communicatorMessageImpl.getTopic());
                if (queue != null) {
                    queue.add(communicatorMessageImpl);
                    if (queue.size() > 10) {
                        queue.remove();
                    }
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(communicatorMessageImpl);
                    this.f1301c.put(communicatorMessageImpl.getTopic(), linkedList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2241c(final CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM2238a = m2238a();
        this.f1299a = scheduledThreadPoolExecutorM2238a;
        scheduledThreadPoolExecutorM2238a.execute(new Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinBroadcastManager.sendBroadcastSync(communicatorMessageImpl, null);
            }
        });
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = m2237a(str).iterator();
        while (it.hasNext()) {
            m2241c((CommunicatorMessageImpl) it.next());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        m2241c(appLovinCommunicatorMessage);
        m2240b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
