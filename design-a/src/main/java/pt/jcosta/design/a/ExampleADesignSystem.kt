package pt.jcosta.design.a

import pt.jcosta.design.ColorTokens
import pt.jcosta.design.DesignSystem

class ExampleADesignSystem : DesignSystem {

    override val colorTokens: ColorTokens
        get() = ExampleAColorTokens()
}