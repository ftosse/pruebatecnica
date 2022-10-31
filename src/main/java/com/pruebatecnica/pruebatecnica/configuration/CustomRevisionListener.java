package com.pruebatecnica.pruebatecnica.configuration;

import com.pruebatecnica.pruebatecnica.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity;}
}
