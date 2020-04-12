/*
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javax.security.auth.kerberos;

import sun.security.krb5.JavaxSecurityAuthKerberosAccess;
import sun.security.krb5.EncryptionKey;
import sun.security.krb5.PrincipalName;

class JavaxSecurityAuthKerberosAccessImpl
        implements JavaxSecurityAuthKerberosAccess {
    public sun.security.krb5.internal.ktab.KeyTab keyTabTakeSnapshot(
            KeyTab ktab) {
        return ktab.takeSnapshot();
    }

    @Override
    public KerberosPrincipal kerberosTicketGetClientAlias(KerberosTicket t) {
        return null;
    }

    @Override
    public void kerberosTicketSetClientAlias(KerberosTicket t, KerberosPrincipal a) {

    }

    @Override
    public KerberosPrincipal kerberosTicketGetServerAlias(KerberosTicket t) {
        return null;
    }

    @Override
    public void kerberosTicketSetServerAlias(KerberosTicket t, KerberosPrincipal a) {

    }

    @Override
    public KerberosTicket kerberosTicketGetProxy(KerberosTicket t) {
        return null;
    }

    @Override
    public void kerberosTicketSetProxy(KerberosTicket t, KerberosTicket p) {

    }
}
