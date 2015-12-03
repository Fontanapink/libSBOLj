// Generated from /${project.parent.artifactId}-core2/src/main/java/org/sbolstandard/core2/Sbol2Terms.java
#include <org/sbolstandard/core2/Sbol2Terms_Module.hpp>

#include <java/lang/NullPointerException.hpp>
#include <java/lang/String.hpp>
#include <org/sbolstandard/core2/Sbol2Terms.hpp>
#include <uk/ac/ncl/intbio/core/datatree/NamespaceBinding.hpp>

template<typename T>
static T* npc(T* t)
{
    if(!t) throw new ::java::lang::NullPointerException();
    return t;
}

org::sbolstandard::core2::Sbol2Terms_Module::Sbol2Terms_Module(const ::default_init_tag&)
    : super(*static_cast< ::default_init_tag* >(0))
{
    clinit();
}

org::sbolstandard::core2::Sbol2Terms_Module::Sbol2Terms_Module()
    : Sbol2Terms_Module(*static_cast< ::default_init_tag* >(0))
{
    ctor();
}

javax::xml::namespace_::QName*& org::sbolstandard::core2::Sbol2Terms_Module::Module_()
{
    clinit();
    return Module__;
}
javax::xml::namespace_::QName* org::sbolstandard::core2::Sbol2Terms_Module::Module__;

javax::xml::namespace_::QName*& org::sbolstandard::core2::Sbol2Terms_Module::hasMapsTo()
{
    clinit();
    return hasMapsTo_;
}
javax::xml::namespace_::QName* org::sbolstandard::core2::Sbol2Terms_Module::hasMapsTo_;

javax::xml::namespace_::QName*& org::sbolstandard::core2::Sbol2Terms_Module::hasMapping()
{
    clinit();
    return hasMapping_;
}
javax::xml::namespace_::QName* org::sbolstandard::core2::Sbol2Terms_Module::hasMapping_;

javax::xml::namespace_::QName*& org::sbolstandard::core2::Sbol2Terms_Module::hasDefinition()
{
    clinit();
    return hasDefinition_;
}
javax::xml::namespace_::QName* org::sbolstandard::core2::Sbol2Terms_Module::hasDefinition_;

extern java::lang::Class *class_(const char16_t *c, int n);

java::lang::Class* org::sbolstandard::core2::Sbol2Terms_Module::class_()
{
    static ::java::lang::Class* c = ::class_(u"org.sbolstandard.core2.Sbol2Terms.Module", 40);
    return c;
}

void org::sbolstandard::core2::Sbol2Terms_Module::clinit()
{
    super::clinit();
    static bool in_cl_init = false;
struct clinit_ {
    clinit_() {
        in_cl_init = true;
        Module__ = npc(Sbol2Terms::sbol2())->withLocalPart(u"Module"_j);
        hasMapsTo_ = npc(Sbol2Terms::sbol2())->withLocalPart(u"mapsTo"_j);
        hasMapping_ = npc(Sbol2Terms::sbol2())->withLocalPart(u"mapping"_j);
        hasDefinition_ = npc(Sbol2Terms::sbol2())->withLocalPart(u"definition"_j);
    }
};

    if(!in_cl_init) {
        static clinit_ clinit_instance;
    }
}

java::lang::Class* org::sbolstandard::core2::Sbol2Terms_Module::getClass0()
{
    return class_();
}
