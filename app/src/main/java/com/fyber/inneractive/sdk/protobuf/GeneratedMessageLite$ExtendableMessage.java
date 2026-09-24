package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends AbstractC9047z0 implements InterfaceC8931e2 {
    protected C8983n0 extensions = C8983n0.f21072d;

    private void eagerlyMergeMessageSetExtension(AbstractC9031w abstractC9031w, C9037x0 c9037x0, C8947h0 c8947h0, int i) throws IOException {
        parseExtension(abstractC9031w, c8947h0, c9037x0, (i << 3) | 2, i);
    }

    private void mergeMessageSetExtensionFromBytes(AbstractC9011s abstractC9011s, C8947h0 c8947h0, C9037x0 c9037x0) throws IOException {
        InterfaceC8925d2 interfaceC8925d2 = (InterfaceC8925d2) this.extensions.f21073a.get(c9037x0.f21166d);
        InterfaceC8919c2 builder = interfaceC8925d2 != null ? interfaceC8925d2.toBuilder() : null;
        if (builder == null) {
            builder = c9037x0.f21165c.newBuilderForType();
        }
        AbstractC9017t0 abstractC9017t0 = (AbstractC9017t0) builder;
        abstractC9017t0.getClass();
        try {
            AbstractC9031w abstractC9031wMo21703d = abstractC9011s.mo21703d();
            abstractC9017t0.m21750a(abstractC9031wMo21703d, c8947h0);
            abstractC9031wMo21703d.mo21716a(0);
            Object objM21751a = abstractC9017t0.m21751a();
            C8983n0 c8983n0EnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            C9032w0 c9032w0 = c9037x0.f21166d;
            if (c9032w0.f21151c.m21661a() == EnumC8969k4.ENUM) {
                objM21751a = Integer.valueOf(((InterfaceC8924d1) objM21751a).mo20330a());
            }
            c8983n0EnsureExtensionsAreMutable.m21681c(c9032w0, objM21751a);
        } catch (C8984n1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading " + abstractC9017t0.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    private <MessageType extends InterfaceC8925d2> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws IOException {
        int iMo21742u = 0;
        C9000q c9000qMo21724e = null;
        C9037x0 c9037x0M21618a = null;
        while (true) {
            int iMo21741t = abstractC9031w.mo21741t();
            if (iMo21741t == 0) {
                break;
            }
            if (iMo21741t == 16) {
                iMo21742u = abstractC9031w.mo21742u();
                if (iMo21742u != 0) {
                    c9037x0M21618a = c8947h0.m21618a(iMo21742u, messagetype);
                }
            } else if (iMo21741t == 26) {
                if (iMo21742u == 0 || c9037x0M21618a == null) {
                    c9000qMo21724e = abstractC9031w.mo21724e();
                } else {
                    eagerlyMergeMessageSetExtension(abstractC9031w, c9037x0M21618a, c8947h0, iMo21742u);
                    c9000qMo21724e = null;
                }
            } else if (!abstractC9031w.mo21725e(iMo21741t)) {
                break;
            }
        }
        abstractC9031w.mo21716a(12);
        if (c9000qMo21724e == null || iMo21742u == 0) {
            return;
        }
        if (c9037x0M21618a != null) {
            mergeMessageSetExtensionFromBytes(c9000qMo21724e, c8947h0, c9037x0M21618a);
        } else {
            mergeLengthDelimitedField(iMo21742u, c9000qMo21724e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27, types: [com.fyber.inneractive.sdk.protobuf.d1] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Integer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean parseExtension(AbstractC9031w abstractC9031w, C8947h0 c8947h0, C9037x0 c9037x0, int i, int i2) throws IOException {
        boolean z;
        Object objM21751a;
        InterfaceC8925d2 interfaceC8925d2;
        int i3 = i & 7;
        boolean z2 = false;
        if (c9037x0 == null) {
            z = false;
            z2 = true;
        } else {
            EnumC8963j4 enumC8963j4 = c9037x0.f21166d.f21151c;
            C8983n0 c8983n0 = C8983n0.f21072d;
            if (i3 == enumC8963j4.m21662b()) {
                z = false;
            } else {
                C9032w0 c9032w0 = c9037x0.f21166d;
                if (c9032w0.f21152d && c9032w0.f21151c.mo21559c()) {
                    EnumC8963j4 enumC8963j5 = c9037x0.f21166d.f21151c;
                    if (i3 == 2) {
                        z = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = true;
                }
            }
        }
        if (z2) {
            return parseUnknownField(i, abstractC9031w);
        }
        ensureExtensionsAreMutable();
        if (z) {
            int iMo21722d = abstractC9031w.mo21722d(abstractC9031w.mo21734m());
            if (c9037x0.f21166d.f21151c == EnumC8963j4.ENUM) {
                while (abstractC9031w.mo21715a() > 0) {
                    Object objMo20329a = c9037x0.f21166d.f21149a.mo20329a(abstractC9031w.mo21728g());
                    if (objMo20329a == 0) {
                        return true;
                    }
                    C8983n0 c8983n1 = this.extensions;
                    C9032w0 c9032w1 = c9037x0.f21166d;
                    if (c9032w1.f21151c.m21661a() == EnumC8969k4.ENUM) {
                        objMo20329a = Integer.valueOf(objMo20329a.mo20330a());
                    }
                    c8983n1.m21679a(c9032w1, objMo20329a);
                }
            } else {
                while (abstractC9031w.mo21715a() > 0) {
                    EnumC8963j4 enumC8963j6 = c9037x0.f21166d.f21151c;
                    C8983n0 c8983n2 = C8983n0.f21072d;
                    this.extensions.m21679a(c9037x0.f21166d, AbstractC8999p4.m21699a(abstractC9031w, enumC8963j6, EnumC8993o4.LOOSE));
                }
            }
            abstractC9031w.mo21720c(iMo21722d);
        } else {
            int i4 = AbstractC9012s0.f21109a[c9037x0.f21166d.f21151c.m21661a().ordinal()];
            if (i4 == 1) {
                C9032w0 c9032w2 = c9037x0.f21166d;
                InterfaceC8919c2 builder = (c9032w2.f21152d || (interfaceC8925d2 = (InterfaceC8925d2) this.extensions.f21073a.get(c9032w2)) == null) ? null : interfaceC8925d2.toBuilder();
                if (builder == null) {
                    builder = c9037x0.f21165c.newBuilderForType();
                }
                C9032w0 c9032w3 = c9037x0.f21166d;
                if (c9032w3.f21151c == EnumC8963j4.GROUP) {
                    abstractC9031w.mo21717a(c9032w3.f21150b, builder, c8947h0);
                } else {
                    abstractC9031w.mo21718a(builder, c8947h0);
                }
                objM21751a = ((AbstractC9017t0) builder).m21751a();
            } else if (i4 != 2) {
                EnumC8963j4 enumC8963j7 = c9037x0.f21166d.f21151c;
                C8983n0 c8983n3 = C8983n0.f21072d;
                objM21751a = AbstractC8999p4.m21699a(abstractC9031w, enumC8963j7, EnumC8993o4.LOOSE);
            } else {
                int iMo21728g = abstractC9031w.mo21728g();
                InterfaceC8924d1 interfaceC8924d1Mo20329a = c9037x0.f21166d.f21149a.mo20329a(iMo21728g);
                if (interfaceC8924d1Mo20329a == null) {
                    mergeVarintField(i2, iMo21728g);
                    return true;
                }
                objM21751a = interfaceC8924d1Mo20329a;
            }
            C9032w0 c9032w4 = c9037x0.f21166d;
            if (c9032w4.f21152d) {
                C8983n0 c8983n4 = this.extensions;
                if (c9032w4.f21151c.m21661a() == EnumC8969k4.ENUM) {
                    objM21751a = Integer.valueOf(((InterfaceC8924d1) objM21751a).mo20330a());
                }
                c8983n4.m21679a(c9032w4, objM21751a);
            } else {
                C8983n0 c8983n5 = this.extensions;
                if (c9032w4.f21151c.m21661a() == EnumC8969k4.ENUM) {
                    objM21751a = Integer.valueOf(((InterfaceC8924d1) objM21751a).mo20330a());
                }
                c8983n5.m21681c(c9032w4, objM21751a);
            }
        }
        return true;
    }

    private void verifyExtensionContainingType(C9037x0 c9037x0) {
        if (c9037x0.f21163a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public C8983n0 ensureExtensionsAreMutable() {
        C8983n0 c8983n0 = this.extensions;
        if (c8983n0.f21074b) {
            this.extensions = c8983n0.m43994clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.m21683c();
    }

    public int extensionsSerializedSize() {
        return this.extensions.m21680b();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.m21677a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9047z0, com.fyber.inneractive.sdk.protobuf.InterfaceC8931e2
    public /* bridge */ /* synthetic */ InterfaceC8925d2 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(AbstractC8929e0 abstractC8929e0) {
        C9037x0 c9037x0Access$000 = AbstractC9047z0.access$000(abstractC8929e0);
        verifyExtensionContainingType(c9037x0Access$000);
        C8983n0 c8983n0 = this.extensions;
        Type type = (Type) c8983n0.f21073a.get(c9037x0Access$000.f21166d);
        if (type == 0) {
            return (Type) c9037x0Access$000.f21164b;
        }
        C9032w0 c9032w0 = c9037x0Access$000.f21166d;
        if (c9032w0.f21152d) {
            if (c9032w0.f21151c.m21661a() == EnumC8969k4.ENUM) {
                ?? r1 = (Type) new ArrayList();
                for (Object objMo20329a : (List) type) {
                    if (c9037x0Access$000.f21166d.f21151c.m21661a() == EnumC8969k4.ENUM) {
                        objMo20329a = c9037x0Access$000.f21166d.f21149a.mo20329a(((Integer) objMo20329a).intValue());
                    }
                    r1.add(objMo20329a);
                }
                return r1;
            }
        } else if (c9032w0.f21151c.m21661a() == EnumC8969k4.ENUM) {
            return (Type) c9037x0Access$000.f21166d.f21149a.mo20329a(((Integer) type).intValue());
        }
        return type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> Type getExtension(AbstractC8929e0 abstractC8929e0, int i) {
        C9037x0 c9037x0Access$000 = AbstractC9047z0.access$000(abstractC8929e0);
        verifyExtensionContainingType(c9037x0Access$000);
        C8983n0 c8983n0 = this.extensions;
        C9032w0 c9032w0 = c9037x0Access$000.f21166d;
        c8983n0.getClass();
        if (!c9032w0.f21152d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = c8983n0.f21073a.get(c9032w0);
        if (obj == null) {
            throw new IndexOutOfBoundsException();
        }
        Type type = (Type) ((List) obj).get(i);
        return c9037x0Access$000.f21166d.f21151c.m21661a() == EnumC8969k4.ENUM ? (Type) c9037x0Access$000.f21166d.f21149a.mo20329a(((Integer) type).intValue()) : type;
    }

    public final <Type> int getExtensionCount(AbstractC8929e0 abstractC8929e0) {
        C9037x0 c9037x0Access$000 = AbstractC9047z0.access$000(abstractC8929e0);
        verifyExtensionContainingType(c9037x0Access$000);
        C8983n0 c8983n0 = this.extensions;
        C9032w0 c9032w0 = c9037x0Access$000.f21166d;
        c8983n0.getClass();
        if (!c9032w0.f21152d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = c8983n0.f21073a.get(c9032w0);
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public final <Type> boolean hasExtension(AbstractC8929e0 abstractC8929e0) {
        C9037x0 c9037x0Access$000 = AbstractC9047z0.access$000(abstractC8929e0);
        verifyExtensionContainingType(c9037x0Access$000);
        C8983n0 c8983n0 = this.extensions;
        C9032w0 c9032w0 = c9037x0Access$000.f21166d;
        c8983n0.getClass();
        if (c9032w0.f21152d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c8983n0.f21073a.get(c9032w0) != null;
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        C8983n0 c8983n0 = this.extensions;
        if (c8983n0.f21074b) {
            this.extensions = c8983n0.m43994clone();
        }
        this.extensions.m21678a(messagetype.extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9047z0, com.fyber.inneractive.sdk.protobuf.InterfaceC8925d2
    public /* bridge */ /* synthetic */ InterfaceC8919c2 newBuilderForType() {
        return newBuilderForType();
    }

    public C9027v0 newExtensionWriter() {
        return new C9027v0(this);
    }

    public C9027v0 newMessageSetExtensionWriter() {
        return new C9027v0(this);
    }

    public <MessageType extends InterfaceC8925d2> boolean parseUnknownField(MessageType messagetype, AbstractC9031w abstractC9031w, C8947h0 c8947h0, int i) throws IOException {
        int i2 = i >>> 3;
        return parseExtension(abstractC9031w, c8947h0, c8947h0.m21618a(i2, messagetype), i, i2);
    }

    public <MessageType extends InterfaceC8925d2> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC9031w abstractC9031w, C8947h0 c8947h0, int i) throws IOException {
        if (i != 11) {
            return (i & 7) == 2 ? parseUnknownField(messagetype, abstractC9031w, c8947h0, i) : abstractC9031w.mo21725e(i);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, abstractC9031w, c8947h0);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9047z0, com.fyber.inneractive.sdk.protobuf.InterfaceC8925d2
    public /* bridge */ /* synthetic */ InterfaceC8919c2 toBuilder() {
        return toBuilder();
    }
}
