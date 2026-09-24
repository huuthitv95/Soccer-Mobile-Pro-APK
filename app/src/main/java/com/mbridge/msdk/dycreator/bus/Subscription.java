package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes5.dex */
final class Subscription {

    /* JADX INFO: renamed from: a */
    final Object f35271a;

    /* JADX INFO: renamed from: b */
    final SubscriberMethod f35272b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f35271a = obj;
        this.f35272b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f35271a == subscription.f35271a && this.f35272b.equals(subscription.f35272b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f35271a.hashCode() + this.f35272b.f35268d.hashCode();
    }
}
