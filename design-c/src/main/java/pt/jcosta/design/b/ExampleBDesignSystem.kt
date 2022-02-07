package pt.jcosta.design.b

import pt.jcosta.design.ColorTokens
import pt.jcosta.design.DesignSystem

class ExampleBDesignSystem : DesignSystem {

    override val colorTokens: ColorTokens
        get() = ExampleBColorTokens()
}