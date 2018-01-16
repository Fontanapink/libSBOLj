package org.sbolstandard.core2;

import java.net.URI;
import java.util.HashMap;
import java.util.Map.Entry;

public class Implementation extends TopLevel {
	
	private URI built;

	/**
	 * @param identity
	 *            identity of the implementation
	 * @throws SBOLValidationException
	 *             if an SBOL validation rule violation occurred in the following
	 *             constructor or method:
	 *             <ul>
	 *             <li>{@link TopLevel#TopLevel(URI)}, or</li>
	 *             </ul>
	 */
	Implementation(URI identity) throws SBOLValidationException {
		super(identity);
	}
	
	/**
	 * @param implementation
	 * @throws SBOLValidationException
	 *             if an SBOL validation rule violation occurred in any of the
	 *             following constructors or methods:
	 *             <ul>
	 *             <li>{@link TopLevel#TopLevel(TopLevel)},</li>
	 *             </ul>
	 */
	private Implementation(Implementation implementation) throws SBOLValidationException {
		super(implementation);

		this.built = implementation.getBuiltURI();
	}
	
	/**
	 * Checks if the built property is set.
	 * 
	 * @return {@code true} if it is not {@code null}, {@code false} otherwise
	 */
	public boolean isSetBuilt() {
		return built != null;
	}
	
	/**
	 * Returns the URI of the component definition or module definition built
	 *
	 * @return the URI of built
	 */
	public URI getBuiltURI() {
		return this.built;
	}
	
	/**
	 * Returns the component definition or module definition referenced by the built field.
	 *
	 * @return {@code null} if the associated SBOLDocument instance is {@code null}
	 *         or no matching component definition or module definition referenced;
	 *         or the matching component definition or module definition otherwise.
	 */
	public TopLevel getBuilt() {
		if (this.getSBOLDocument() == null)
			return null;
		
		if(this.getSBOLDocument().getComponentDefinition(built) == null) {
			return this.getSBOLDocument().getModuleDefinition(built);
		}
		
		return this.getSBOLDocument().getComponentDefinition(built);
	}

	/**
	 * Sets the URI of the built property to the given one.
	 *
	 * @param builtURI
	 *            the given URI to set to
	 * @throws SBOLValidationException 
	 * 				on SBOL validation rule violation XXXXX.
	 */
	public void setBuiltURI(URI builtURI) throws SBOLValidationException {
		if(this.getSBOLDocument().getComponentDefinition(builtURI) == null &&
				this.getSBOLDocument().getModuleDefinition(builtURI) == null) {
			throw new SBOLValidationException("sbol-XXXXX", this);
		}
		
		this.built = builtURI;
	}
	
	/**
	 * Sets the the built property to the given one.
	 *
	 * @param built
	 *            the given component definition or module definition to set to
	 * @throws SBOLValidationException 
	 * 				on SBOL validation rule violation XXXXX.
	 */
	public void setBuilt(TopLevel built) throws SBOLValidationException {
		if(!(built instanceof ComponentDefinition) && !(built instanceof ModuleDefinition)) {
			throw new SBOLValidationException("sbol-XXXXX", this);
		}
		
		this.built = built.getIdentity();
	}

	/**
	 * Sets the built property of the Implementation to {@code null}.
	 */
	public void unsetBuilt() {
		this.built = null;
	}

	@Override
	Identified deepCopy() throws SBOLValidationException {
		return new Implementation(this);
	}

	void copy(Implementation implementation) throws SBOLValidationException {
		((TopLevel) this).copy((TopLevel) implementation);
		
		if (implementation.isSetBuilt()) {
			this.setBuiltURI(implementation.getBuiltURI());
		}
	}
	
	@Override
	Identified copy(String URIprefix, String displayId, String version) throws SBOLValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/**
	 * @throws SBOLValidationException
	 *             an SBOL validation rule violation occurred in either of the
	 *             following methods:
	 *             <ul>
	 *             <li>{@link URIcompliance#isChildURIcompliant(Identified, Identified)}.</li>
	 *             </ul>
	 */
	void checkDescendantsURIcompliance() throws SBOLValidationException {
		// TODO is this needed?
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode() * prime;

		result *= this.built != null ? this.built.hashCode() : 1;

		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sbolstandard.core2.abstract_classes.Documented#equals(java.lang.Instance)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Implementation other = (Implementation) obj;
		if (!this.built.equals(other.getBuiltURI()))
			return false;

		return true;
	}
	
	@Override
	public String toString() {
		return "Implementation [" + super.toString()
				+ (this.isSetBuilt() ? ", built=" + this.getBuiltURI() : "")
				+ "]";
	}

}
