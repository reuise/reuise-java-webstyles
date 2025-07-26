package dev.reuise.webstyles;
import java.util.EnumSet;
import java.util.Map;
public interface Style {
    static final StyleProperty ALIGN_CONTENT = new StyleProperty("align-content");

    static final StyleProperty ALIGN_ITEMS = new StyleProperty("align-items");

    static final StyleProperty ALIGN_SELF = new StyleProperty("align-self");

    static final StyleProperty ANIMATION = new StyleProperty("animation");

    static final StyleProperty ANIMATION_DELAY = new StyleProperty("animation-delay");

    static final StyleProperty ANIMATION_DIRECTION = new StyleProperty("animation-direction");

    static final StyleProperty ANIMATION_DURATION = new StyleProperty("animation-duration");

    static final StyleProperty ANIMATION_FILL_MODE = new StyleProperty("animation-fill-mode");

    static final StyleProperty ANIMATION_ITERATION_COUNT = new StyleProperty("animation-iteration-count");

    static final StyleProperty ANIMATION_NAME = new StyleProperty("animation-name");

    static final StyleProperty ANIMATION_PLAY_STATE = new StyleProperty("animation-play-state");

    static final StyleProperty ANIMATION_TIMING_FUNCTION = new StyleProperty("animation-timing-function");

    static final StyleProperty AZIMUTH = new StyleProperty("azimuth");

    static final StyleProperty BACKDROP_FILTER = new StyleProperty("backdrop-filter");

    static final StyleProperty BACKFACE_VISIBILITY = new StyleProperty("backface-visibility");

    static final StyleProperty BACKGROUND = new StyleProperty("background");

    static final StyleProperty BACKGROUND_ATTACHMENT = new StyleProperty("background-attachment");

    static final StyleProperty BACKGROUND_COLOR = new StyleProperty("background-color");

    static final StyleProperty BACKGROUND_IMAGE = new StyleProperty("background-image");

    static final StyleProperty BACKGROUND_POSITION = new StyleProperty("background-position");

    static final StyleProperty BACKGROUND_REPEAT = new StyleProperty("background-repeat");

    static final StyleProperty BACKGROUND_SIZE = new StyleProperty("background-size");

    static final StyleProperty INSET = new StyleProperty("inset");

    static final StyleProperty BORDER = new StyleProperty("border");

    static final StyleProperty BORDER_BOTTOM = new StyleProperty("border-bottom");

    static final StyleProperty BORDER_BOTTOM_COLOR = new StyleProperty("border-bottom-color");

    static final StyleProperty BORDER_BOTTOM_LEFT_RADIUS = new StyleProperty("border-bottom-left-radius", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty BORDER_BOTTOM_RIGHT_RADIUS = new StyleProperty("border-bottom-right-radius", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty BORDER_BOTTOM_STYLE = new StyleProperty("border-bottom-style");

    static final StyleProperty BORDER_BOTTOM_WIDTH = new StyleProperty("border-bottom-width");

    static final StyleProperty BORDER_COLLAPSE = new StyleProperty("border-collapse");

    static final StyleProperty BORDER_COLOR = new StyleProperty("border-color");

    static final StyleProperty BORDER_IMAGE = new StyleProperty("border-image");

    static final StyleProperty BORDER_IMAGE_OUTSET = new StyleProperty("border-image-outset", EnumSet.of(StyleProperty.DataType.LENGTH));

    static final StyleProperty BORDER_IMAGE_REPEAT = new StyleProperty("border-image-repeat");

    static final StyleProperty BORDER_IMAGE_SLICE = new StyleProperty("border-image-slice");

    static final StyleProperty BORDER_IMAGE_SOURCE = new StyleProperty("border-image-source");

    static final StyleProperty BORDER_IMAGE_WIDTH = new StyleProperty("border-image-width", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty BORDER_LEFT = new StyleProperty("border-left");

    static final StyleProperty BORDER_LEFT_COLOR = new StyleProperty("border-left-color");

    static final StyleProperty BORDER_LEFT_STYLE = new StyleProperty("border-left-style");

    static final StyleProperty BORDER_LEFT_WIDTH = new StyleProperty("border-left-width");

    static final StyleProperty BORDER_RADIUS = new StyleProperty("border-radius", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty BORDER_RIGHT = new StyleProperty("border-right");

    static final StyleProperty BORDER_RIGHT_COLOR = new StyleProperty("border-right-color");

    static final StyleProperty BORDER_RIGHT_STYLE = new StyleProperty("border-right-style");

    static final StyleProperty BORDER_RIGHT_WIDTH = new StyleProperty("border-right-width");

    static final StyleProperty BORDER_SPACING = new StyleProperty("border-spacing", EnumSet.of(StyleProperty.DataType.LENGTH));

    static final StyleProperty BORDER_STYLE = new StyleProperty("border-style");

    static final StyleProperty BORDER_TOP = new StyleProperty("border-top");

    static final StyleProperty BORDER_TOP_COLOR = new StyleProperty("border-top-color");

    static final StyleProperty BORDER_TOP_LEFT_RADIUS = new StyleProperty("border-top-left-radius", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty BORDER_TOP_RIGHT_RADIUS = new StyleProperty("border-top-right-radius", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty BORDER_TOP_STYLE = new StyleProperty("border-top-style");

    static final StyleProperty BORDER_TOP_WIDTH = new StyleProperty("border-top-width");

    static final StyleProperty BORDER_WIDTH = new StyleProperty("border-width");

    static final StyleProperty BOTTOM = new StyleProperty("bottom", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty BOX_SHADOW = new StyleProperty("box-shadow");

    static final StyleProperty BOX_SIZING = new StyleProperty("box-sizing");

    static final StyleProperty CAPTION_SIDE = new StyleProperty("caption-side");

    static final StyleProperty CLEAR = new StyleProperty("clear");

    static final StyleProperty CLIP = new StyleProperty("clip");

    static final StyleProperty CLIP_PATH = new StyleProperty("clip-path");

    static final StyleProperty COLOR = new StyleProperty("color");

    static final StyleProperty CONTAIN = new StyleProperty("contain");

    static final StyleProperty CONTENT = new StyleProperty("content");

    static final StyleProperty CONTENT_VISIBILITY = new StyleProperty("content-visibility");

    static final StyleProperty COUNTER_INCREMENT = new StyleProperty("counter-increment", EnumSet.of(StyleProperty.DataType.INTEGER));

    static final StyleProperty COUNTER_RESET = new StyleProperty("counter-reset", EnumSet.of(StyleProperty.DataType.INTEGER));

    static final StyleProperty CSS_FLOAT = new StyleProperty("float");

    static final StyleProperty CURSOR = new StyleProperty("cursor");

    static final StyleProperty DIRECTION = new StyleProperty("direction");

    static final StyleProperty DISPLAY = new StyleProperty("display");

    static final StyleProperty EMPTY_CELLS = new StyleProperty("empty-cells");

    static final StyleProperty FLEX = new StyleProperty("flex");

    static final StyleProperty FLEX_BASIS = new StyleProperty("flex-basis");

    static final StyleProperty FLEX_DIRECTION = new StyleProperty("flex-direction");

    static final StyleProperty FLEX_FLOW = new StyleProperty("flex-flow");

    static final StyleProperty FLEX_GROW = new StyleProperty("flex-grow");

    static final StyleProperty FLEX_SHRINK = new StyleProperty("flex-shrink");

    static final StyleProperty FLEX_WRAP = new StyleProperty("flex-wrap");

    static final StyleProperty FONT = new StyleProperty("font");

    static final StyleProperty FONT_FAMILY = new StyleProperty("font-family");

    static final StyleProperty FONT_SIZE = new StyleProperty("font-size", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty FONT_SIZE_ADJUST = new StyleProperty("font-size-adjust");

    static final StyleProperty FONT_STRETCH = new StyleProperty("font-stretch");

    static final StyleProperty FONT_STYLE = new StyleProperty("font-style");

    static final StyleProperty FONT_VARIANT = new StyleProperty("font-variant");

    static final StyleProperty FONT_WEIGHT = new StyleProperty("font-weight");

    static final StyleProperty GRID = new StyleProperty("grid");

    static final StyleProperty GRID_AREA = new StyleProperty("grid-area");

    static final StyleProperty GRID_AUTO_COLUMNS = new StyleProperty("grid-auto-columns");

    static final StyleProperty GRID_AUTO_ROWS = new StyleProperty("grid-auto-rows");

    static final StyleProperty GRID_COLUMN = new StyleProperty("grid-column");

    static final StyleProperty GRID_COLUMN_END = new StyleProperty("grid-column-end");

    static final StyleProperty GRID_COLUMN_START = new StyleProperty("grid-column-start");

    static final StyleProperty GRID_ROW = new StyleProperty("grid-row");

    static final StyleProperty GRID_ROW_END = new StyleProperty("grid-row-end");

    static final StyleProperty GRID_ROW_START = new StyleProperty("grid-row-start");

    static final StyleProperty GRID_TEMPLATE = new StyleProperty("grid-template");

    static final StyleProperty GRID_TEMPLATE_AREAS = new StyleProperty("grid-template-areas");

    static final StyleProperty GRID_TEMPLATE_COLUMNS = new StyleProperty("grid-template-columns");

    static final StyleProperty GRID_TEMPLATE_ROWS = new StyleProperty("grid-template-rows");

    static final StyleProperty HEIGHT = new StyleProperty("height", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty JUSTIFY_CONTENT = new StyleProperty("justify-content");

    static final StyleProperty LEFT = new StyleProperty("left", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty LETTER_SPACING = new StyleProperty("letter-spacing", EnumSet.of(StyleProperty.DataType.LENGTH));

    static final StyleProperty LINE_HEIGHT = new StyleProperty("line-height", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty LIST_STYLE = new StyleProperty("list-style");

    static final StyleProperty LIST_STYLE_IMAGE = new StyleProperty("list-style-image");

    static final StyleProperty LIST_STYLE_POSITION = new StyleProperty("list-style-position");

    static final StyleProperty LIST_STYLE_TYPE = new StyleProperty("list-style-type");

    static final StyleProperty MARGIN = new StyleProperty("margin", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MARGIN_BOTTOM = new StyleProperty("margin-bottom", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MARGIN_LEFT = new StyleProperty("margin-left", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MARGIN_RIGHT = new StyleProperty("margin-right", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MARGIN_TOP = new StyleProperty("margin-top", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MASK = new StyleProperty("mask");

    static final StyleProperty MAX_HEIGHT = new StyleProperty("max-height", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MAX_WIDTH = new StyleProperty("max-width", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MIN_HEIGHT = new StyleProperty("min-height", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty MIN_WIDTH = new StyleProperty("min-width", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty OBJECT_FIT = new StyleProperty("object-fit");

    static final StyleProperty OBJECT_POSITION = new StyleProperty("object-position");

    static final StyleProperty OPACITY = new StyleProperty("opacity");

    static final StyleProperty ORDER = new StyleProperty("order", EnumSet.of(StyleProperty.DataType.INTEGER));

    static final StyleProperty ORPHANS = new StyleProperty("orphans", EnumSet.of(StyleProperty.DataType.INTEGER));

    static final StyleProperty OUTLINE = new StyleProperty("outline");

    static final StyleProperty OUTLINE_COLOR = new StyleProperty("outline-color");

    static final StyleProperty OUTLINE_OFFSET = new StyleProperty("outline-offset", EnumSet.of(StyleProperty.DataType.LENGTH));

    static final StyleProperty OUTLINE_STYLE = new StyleProperty("outline-style");

    static final StyleProperty OUTLINE_WIDTH = new StyleProperty("outline-width");

    static final StyleProperty OVERFLOW = new StyleProperty("overflow");

    static final StyleProperty PADDING = new StyleProperty("padding", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty PADDING_BOTTOM = new StyleProperty("padding-bottom", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty PADDING_LEFT = new StyleProperty("padding-left", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty PADDING_RIGHT = new StyleProperty("padding-right", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty PADDING_TOP = new StyleProperty("padding-top", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty PAGE = new StyleProperty("page");

    static final StyleProperty PAGE_BREAK_AFTER = new StyleProperty("page-break-after");

    static final StyleProperty PAGE_BREAK_BEFORE = new StyleProperty("page-break-before");

    static final StyleProperty PAGE_BREAK_INSIDE = new StyleProperty("page-break-inside");

    static final StyleProperty PERSPECTIVE = new StyleProperty("perspective", EnumSet.of(StyleProperty.DataType.LENGTH));

    static final StyleProperty PERSPECTIVE_ORIGIN = new StyleProperty("perspective-origin");

    static final StyleProperty POINTER_EVENTS = new StyleProperty("pointer-events");

    static final StyleProperty POSITION = new StyleProperty("position");

    static final StyleProperty QUOTES = new StyleProperty("quotes");

    static final StyleProperty RESIZE = new StyleProperty("resize");

    static final StyleProperty RIGHT = new StyleProperty("right", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty TABLE_LAYOUT = new StyleProperty("table-layout");

    static final StyleProperty TEXT_ALIGN = new StyleProperty("text-align");

    static final StyleProperty TEXT_DECORATION = new StyleProperty("text-decoration");

    static final StyleProperty TEXT_DECORATION_COLOR = new StyleProperty("text-decoration-color");

    static final StyleProperty TEXT_DECORATION_LINE = new StyleProperty("text-decoration-line");

    static final StyleProperty TEXT_DECORATION_STYLE = new StyleProperty("text-decoration-style");

    static final StyleProperty TEXT_INDENT = new StyleProperty("text-indent", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty TEXT_OVERFLOW = new StyleProperty("text-overflow");

    static final StyleProperty TEXT_SHADOW = new StyleProperty("text-shadow");

    static final StyleProperty TEXT_TRANSFORM = new StyleProperty("text-transform");

    static final StyleProperty TOP = new StyleProperty("top", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty TRANSFORM = new StyleProperty("transform");

    static final StyleProperty TRANSFORM_ORIGIN = new StyleProperty("transform-origin", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty TRANSFORM_STYLE = new StyleProperty("transform-style");

    static final StyleProperty TRANSITION = new StyleProperty("transition");

    static final StyleProperty TRANSITION_DELAY = new StyleProperty("transition-delay");

    static final StyleProperty TRANSITION_DURATION = new StyleProperty("transition-duration");

    static final StyleProperty TRANSITION_PROPERTY = new StyleProperty("transition-property");

    static final StyleProperty TRANSITION_TIMING_FUNCTION = new StyleProperty("transition-timing-function");

    static final StyleProperty UNICODE_BIDI = new StyleProperty("unicode-bidi");

    static final StyleProperty USER_SELECT = new StyleProperty("user-select");

    static final StyleProperty VERTICAL_ALIGN = new StyleProperty("vertical-align", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty VISIBILITY = new StyleProperty("visibility");

    static final StyleProperty WHITE_SPACE = new StyleProperty("white-space");

    static final StyleProperty WIDOWS = new StyleProperty("widows", EnumSet.of(StyleProperty.DataType.INTEGER));

    static final StyleProperty WIDTH = new StyleProperty("width", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty WILL_CHANGE = new StyleProperty("will-change");

    static final StyleProperty WORD_SPACING = new StyleProperty("word-spacing", EnumSet.of(StyleProperty.DataType.LENGTH));

    static final StyleProperty WORD_WRAP = new StyleProperty("word-wrap");

    static final StyleProperty Z_INDEX = new StyleProperty("z-index", EnumSet.of(StyleProperty.DataType.INTEGER));

    static final StyleProperty ROW_GAP = new StyleProperty("row-gap", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    static final StyleProperty COLUMN_GAP = new StyleProperty("column-gap", EnumSet.of(StyleProperty.DataType.LENGTH, StyleProperty.DataType.PERCENTAGE));

    /**
     * https://developer.mozilla.org/docs/Web/CSS/align-content
     */
    String getAlignContent();

    Style setAlignContent(String alignContent);

    Style setAlignContent(String alignContent, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/align-items
     */
    String getAlignItems();

    Style setAlignItems(String alignItems);

    Style setAlignItems(String alignItems, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/align-self
     */
    String getAlignSelf();

    Style setAlignSelf(String alignSelf);

    Style setAlignSelf(String alignSelf, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation
     */
    Object getAnimation();

    Style setAnimation(Object animation);

    Style setAnimation(Object animation, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-delay
     */
    String getAnimationDelay();

    Style setAnimationDelay(String animationDelay);

    Style setAnimationDelay(String animationDelay, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-direction
     */
    String getAnimationDirection();

    Style setAnimationDirection(String animationDirection);

    Style setAnimationDirection(String animationDirection, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-duration
     */
    String getAnimationDuration();

    Style setAnimationDuration(String animationDuration);

    Style setAnimationDuration(String animationDuration, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-fill-mode
     */
    String getAnimationFillMode();

    Style setAnimationFillMode(String animationFillMode);

    Style setAnimationFillMode(String animationFillMode, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-iteration-count
     */
    Object getAnimationIterationCount();

    Style setAnimationIterationCount(Object animationIterationCount);

    Style setAnimationIterationCount(Object animationIterationCount, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-name
     */
    String getAnimationName();

    Style setAnimationName(String animationName);

    Style setAnimationName(String animationName, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-play-state
     */
    String getAnimationPlayState();

    Style setAnimationPlayState(String animationPlayState);

    Style setAnimationPlayState(String animationPlayState, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/animation-timing-function
     */
    String getAnimationTimingFunction();

    Style setAnimationTimingFunction(String animationTimingFunction);

    Style setAnimationTimingFunction(String animationTimingFunction, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/azimuth
     */
    String getAzimuth();

    Style setAzimuth(String azimuth);

    Style setAzimuth(String azimuth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
     */
    String getBackdropFilter();

    Style setBackdropFilter(String backdropFilter);

    Style setBackdropFilter(String backdropFilter, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/backface-visibility
     */
    String getBackfaceVisibility();

    Style setBackfaceVisibility(String backfaceVisibility);

    Style setBackfaceVisibility(String backfaceVisibility, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/background
     */
    String getBackground();

    Style setBackground(String background);

    Style setBackground(String background, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/background-attachment
     */
    String getBackgroundAttachment();

    Style setBackgroundAttachment(String backgroundAttachment);

    Style setBackgroundAttachment(String backgroundAttachment, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/background-color
     */
    String getBackgroundColor();

    Style setBackgroundColor(String backgroundColor);

    Style setBackgroundColor(String backgroundColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/background-image
     */
    String getBackgroundImage();

    Style setBackgroundImage(String backgroundImage);

    Style setBackgroundImage(String backgroundImage, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/background-position
     */
    String getBackgroundPosition();

    Style setBackgroundPosition(String backgroundPosition);

    Style setBackgroundPosition(String backgroundPosition, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/background-repeat
     */
    String getBackgroundRepeat();

    Style setBackgroundRepeat(String backgroundRepeat);

    Style setBackgroundRepeat(String backgroundRepeat, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/background-size
     */
    String getBackgroundSize();

    Style setBackgroundSize(String backgroundSize);

    Style setBackgroundSize(String backgroundSize, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/inset
     */
    String getInset();

    Style setInset(String inset);

    Style setInset(String inset, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border
     */
    String getBorder();

    Style setBorder(String border);

    Style setBorder(String border, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-bottom
     */
    String getBorderBottom();

    Style setBorderBottom(String borderBottom);

    Style setBorderBottom(String borderBottom, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
     */
    String getBorderBottomColor();

    Style setBorderBottomColor(String borderBottomColor);

    Style setBorderBottomColor(String borderBottomColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-bottom-left-radius
     */
    Object getBorderBottomLeftRadius();

    Style setBorderBottomLeftRadius(Object borderBottomLeftRadius);

    Style setBorderBottomLeftRadius(Object borderBottomLeftRadius, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-bottom-right-radius
     */
    Object getBorderBottomRightRadius();

    Style setBorderBottomRightRadius(Object borderBottomRightRadius);

    Style setBorderBottomRightRadius(Object borderBottomRightRadius, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
     */
    String getBorderBottomStyle();

    Style setBorderBottomStyle(String borderBottomStyle);

    Style setBorderBottomStyle(String borderBottomStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-bottom-width
     */
    Object getBorderBottomWidth();

    Style setBorderBottomWidth(Object borderBottomWidth);

    Style setBorderBottomWidth(Object borderBottomWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-collapse
     */
    String getBorderCollapse();

    Style setBorderCollapse(String borderCollapse);

    Style setBorderCollapse(String borderCollapse, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-color
     */
    String getBorderColor();

    Style setBorderColor(String borderColor);

    Style setBorderColor(String borderColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-image
     */
    String getBorderImage();

    Style setBorderImage(String borderImage);

    Style setBorderImage(String borderImage, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-image-outset
     */
    Object getBorderImageOutset();

    Style setBorderImageOutset(Object borderImageOutset);

    Style setBorderImageOutset(Object borderImageOutset, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
     */
    String getBorderImageRepeat();

    Style setBorderImageRepeat(String borderImageRepeat);

    Style setBorderImageRepeat(String borderImageRepeat, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-image-slice
     */
    Object getBorderImageSlice();

    Style setBorderImageSlice(Object borderImageSlice);

    Style setBorderImageSlice(Object borderImageSlice, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-image-source
     */
    String getBorderImageSource();

    Style setBorderImageSource(String borderImageSource);

    Style setBorderImageSource(String borderImageSource, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-image-width
     */
    Object getBorderImageWidth();

    Style setBorderImageWidth(Object borderImageWidth);

    Style setBorderImageWidth(Object borderImageWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-left
     */
    String getBorderLeft();

    Style setBorderLeft(String borderLeft);

    Style setBorderLeft(String borderLeft, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-left-color
     */
    String getBorderLeftColor();

    Style setBorderLeftColor(String borderLeftColor);

    Style setBorderLeftColor(String borderLeftColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-left-style
     */
    String getBorderLeftStyle();

    Style setBorderLeftStyle(String borderLeftStyle);

    Style setBorderLeftStyle(String borderLeftStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-left-width
     */
    Object getBorderLeftWidth();

    Style setBorderLeftWidth(Object borderLeftWidth);

    Style setBorderLeftWidth(Object borderLeftWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-radius
     */
    Object getBorderRadius();

    Style setBorderRadius(Object borderRadius);

    Style setBorderRadius(Object borderRadius, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-right
     */
    String getBorderRight();

    Style setBorderRight(String borderRight);

    Style setBorderRight(String borderRight, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-right-color
     */
    String getBorderRightColor();

    Style setBorderRightColor(String borderRightColor);

    Style setBorderRightColor(String borderRightColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-right-style
     */
    String getBorderRightStyle();

    Style setBorderRightStyle(String borderRightStyle);

    Style setBorderRightStyle(String borderRightStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-right-width
     */
    Object getBorderRightWidth();

    Style setBorderRightWidth(Object borderRightWidth);

    Style setBorderRightWidth(Object borderRightWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-spacing
     */
    String getBorderSpacing();

    Style setBorderSpacing(String borderSpacing);

    Style setBorderSpacing(String borderSpacing, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-style
     */
    String getBorderStyle();

    Style setBorderStyle(String borderStyle);

    Style setBorderStyle(String borderStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-top
     */
    String getBorderTop();

    Style setBorderTop(String borderTop);

    Style setBorderTop(String borderTop, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-top-color
     */
    String getBorderTopColor();

    Style setBorderTopColor(String borderTopColor);

    Style setBorderTopColor(String borderTopColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-top-left-radius
     */
    Object getBorderTopLeftRadius();

    Style setBorderTopLeftRadius(Object borderTopLeftRadius);

    Style setBorderTopLeftRadius(Object borderTopLeftRadius, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-top-right-radius
     */
    Object getBorderTopRightRadius();

    Style setBorderTopRightRadius(Object borderTopRightRadius);

    Style setBorderTopRightRadius(Object borderTopRightRadius, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-top-style
     */
    String getBorderTopStyle();

    Style setBorderTopStyle(String borderTopStyle);

    Style setBorderTopStyle(String borderTopStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-top-width
     */
    Object getBorderTopWidth();

    Style setBorderTopWidth(Object borderTopWidth);

    Style setBorderTopWidth(Object borderTopWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/border-width
     */
    Object getBorderWidth();

    Style setBorderWidth(Object borderWidth);

    Style setBorderWidth(Object borderWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/bottom
     */
    Object getBottom();

    Style setBottom(Object bottom);

    Style setBottom(Object bottom, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/box-shadow
     */
    String getBoxShadow();

    Style setBoxShadow(String boxShadow);

    Style setBoxShadow(String boxShadow, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/box-sizing
     */
    String getBoxSizing();

    Style setBoxSizing(String boxSizing);

    Style setBoxSizing(String boxSizing, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/caption-side
     */
    String getCaptionSide();

    Style setCaptionSide(String captionSide);

    Style setCaptionSide(String captionSide, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/clear
     */
    String getClear();

    Style setClear(String clear);

    Style setClear(String clear, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/clip
     */
    String getClip();

    Style setClip(String clip);

    Style setClip(String clip, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/clip-path
     */
    String getClipPath();

    Style setClipPath(String clipPath);

    Style setClipPath(String clipPath, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/color
     */
    String getColor();

    Style setColor(String color);

    Style setColor(String color, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/contain
     */
    String getContain();

    Style setContain(String contain);

    Style setContain(String contain, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/content
     */
    String getContent();

    Style setContent(String content);

    Style setContent(String content, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/content-visibility
     */
    String getContentVisibility();

    Style setContentVisibility(String contentVisibility);

    Style setContentVisibility(String contentVisibility, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/counter-increment
     */
    String getCounterIncrement();

    Style setCounterIncrement(String counterIncrement);

    Style setCounterIncrement(String counterIncrement, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/counter-reset
     */
    String getCounterReset();

    Style setCounterReset(String counterReset);

    Style setCounterReset(String counterReset, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/float
     */
    String getCssFloat();

    Style setCssFloat(String cssFloat);

    Style setCssFloat(String cssFloat, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/cursor
     */
    String getCursor();

    Style setCursor(String cursor);

    Style setCursor(String cursor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/direction
     */
    String getDirection();

    Style setDirection(String direction);

    Style setDirection(String direction, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/display
     */
    String getDisplay();

    Style setDisplay(String display);

    Style setDisplay(String display, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/empty-cells
     */
    String getEmptyCells();

    Style setEmptyCells(String emptyCells);

    Style setEmptyCells(String emptyCells, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/flex
     */
    String getFlex();

    Style setFlex(String flex);

    Style setFlex(String flex, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/flex-basis
     */
    String getFlexBasis();

    Style setFlexBasis(String flexBasis);

    Style setFlexBasis(String flexBasis, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/flex-direction
     */
    String getFlexDirection();

    Style setFlexDirection(String flexDirection);

    Style setFlexDirection(String flexDirection, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/flex-flow
     */
    String getFlexFlow();

    Style setFlexFlow(String flexFlow);

    Style setFlexFlow(String flexFlow, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/flex-grow
     */
    double getFlexGrow();

    Style setFlexGrow(double flexGrow);

    Style setFlexGrow(double flexGrow, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/flex-shrink
     */
    double getFlexShrink();

    Style setFlexShrink(double flexShrink);

    Style setFlexShrink(double flexShrink, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/flex-wrap
     */
    String getFlexWrap();

    Style setFlexWrap(String flexWrap);

    Style setFlexWrap(String flexWrap, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font
     */
    String getFont();

    Style setFont(String font);

    Style setFont(String font, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font-family
     */
    String getFontFamily();

    Style setFontFamily(String fontFamily);

    Style setFontFamily(String fontFamily, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font-size
     */
    Object getFontSize();

    Style setFontSize(Object fontSize);

    Style setFontSize(Object fontSize, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
     */
    String getFontSizeAdjust();

    Style setFontSizeAdjust(String fontSizeAdjust);

    Style setFontSizeAdjust(String fontSizeAdjust, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font-stretch
     */
    String getFontStretch();

    Style setFontStretch(String fontStretch);

    Style setFontStretch(String fontStretch, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font-style
     */
    String getFontStyle();

    Style setFontStyle(String fontStyle);

    Style setFontStyle(String fontStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font-variant
     */
    String getFontVariant();

    Style setFontVariant(String fontVariant);

    Style setFontVariant(String fontVariant, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/font-weight
     */
    String getFontWeight();

    Style setFontWeight(String fontWeight);

    Style setFontWeight(String fontWeight, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid
     */
    String getGrid();

    Style setGrid(String grid);

    Style setGrid(String grid, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-area
     */
    String getGridArea();

    Style setGridArea(String gridArea);

    Style setGridArea(String gridArea, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
     */
    String getGridAutoColumns();

    Style setGridAutoColumns(String gridAutoColumns);

    Style setGridAutoColumns(String gridAutoColumns, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
     */
    String getGridAutoRows();

    Style setGridAutoRows(String gridAutoRows);

    Style setGridAutoRows(String gridAutoRows, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-column
     */
    String getGridColumn();

    Style setGridColumn(String gridColumn);

    Style setGridColumn(String gridColumn, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-column-end
     */
    String getGridColumnEnd();

    Style setGridColumnEnd(String gridColumnEnd);

    Style setGridColumnEnd(String gridColumnEnd, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-column-start
     */
    String getGridColumnStart();

    Style setGridColumnStart(String gridColumnStart);

    Style setGridColumnStart(String gridColumnStart, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-row
     */
    String getGridRow();

    Style setGridRow(String gridRow);

    Style setGridRow(String gridRow, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-row-end
     */
    String getGridRowEnd();

    Style setGridRowEnd(String gridRowEnd);

    Style setGridRowEnd(String gridRowEnd, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-row-start
     */
    String getGridRowStart();

    Style setGridRowStart(String gridRowStart);

    Style setGridRowStart(String gridRowStart, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-template
     */
    String getGridTemplate();

    Style setGridTemplate(String gridTemplate);

    Style setGridTemplate(String gridTemplate, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
     */
    String getGridTemplateAreas();

    Style setGridTemplateAreas(String gridTemplateAreas);

    Style setGridTemplateAreas(String gridTemplateAreas, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
     */
    String getGridTemplateColumns();

    Style setGridTemplateColumns(String gridTemplateColumns);

    Style setGridTemplateColumns(String gridTemplateColumns, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
     */
    String getGridTemplateRows();

    Style setGridTemplateRows(String gridTemplateRows);

    Style setGridTemplateRows(String gridTemplateRows, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/height
     */
    Object getHeight();

    Style setHeight(Object height);

    Style setHeight(Object height, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/justify-content
     */
    String getJustifyContent();

    Style setJustifyContent(String justifyContent);

    Style setJustifyContent(String justifyContent, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/left
     */
    Object getLeft();

    Style setLeft(Object left);

    Style setLeft(Object left, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/letter-spacing
     */
    String getLetterSpacing();

    Style setLetterSpacing(String letterSpacing);

    Style setLetterSpacing(String letterSpacing, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/line-height
     */
    Object getLineHeight();

    Style setLineHeight(Object lineHeight);

    Style setLineHeight(Object lineHeight, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/list-style
     */
    String getListStyle();

    Style setListStyle(String listStyle);

    Style setListStyle(String listStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/list-style-image
     */
    String getListStyleImage();

    Style setListStyleImage(String listStyleImage);

    Style setListStyleImage(String listStyleImage, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/list-style-position
     */
    String getListStylePosition();

    Style setListStylePosition(String listStylePosition);

    Style setListStylePosition(String listStylePosition, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/list-style-type
     */
    String getListStyleType();

    Style setListStyleType(String listStyleType);

    Style setListStyleType(String listStyleType, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/margin
     */
    Object getMargin();

    Style setMargin(Object margin);

    Style setMargin(Object margin, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/margin-bottom
     */
    Object getMarginBottom();

    Style setMarginBottom(Object marginBottom);

    Style setMarginBottom(Object marginBottom, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/margin-left
     */
    Object getMarginLeft();

    Style setMarginLeft(Object marginLeft);

    Style setMarginLeft(Object marginLeft, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/margin-right
     */
    Object getMarginRight();

    Style setMarginRight(Object marginRight);

    Style setMarginRight(Object marginRight, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/margin-top
     */
    Object getMarginTop();

    Style setMarginTop(Object marginTop);

    Style setMarginTop(Object marginTop, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/mask
     */
    String getMask();

    Style setMask(String mask);

    Style setMask(String mask, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/max-height
     */
    Object getMaxHeight();

    Style setMaxHeight(Object maxHeight);

    Style setMaxHeight(Object maxHeight, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/max-width
     */
    Object getMaxWidth();

    Style setMaxWidth(Object maxWidth);

    Style setMaxWidth(Object maxWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/min-height
     */
    Object getMinHeight();

    Style setMinHeight(Object minHeight);

    Style setMinHeight(Object minHeight, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/min-width
     */
    Object getMinWidth();

    Style setMinWidth(Object minWidth);

    Style setMinWidth(Object minWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/object-fit
     */
    String getObjectFit();

    Style setObjectFit(String objectFit);

    Style setObjectFit(String objectFit, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/object-position
     */
    String getObjectPosition();

    Style setObjectPosition(String objectPosition);

    Style setObjectPosition(String objectPosition, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/opacity
     */
    Object getOpacity();

    Style setOpacity(Object opacity);

    Style setOpacity(Object opacity, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/order
     */
    int getOrder();

    Style setOrder(int order);

    Style setOrder(int order, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/orphans
     */
    String getOrphans();

    Style setOrphans(String orphans);

    Style setOrphans(String orphans, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/outline
     */
    String getOutline();

    Style setOutline(String outline);

    Style setOutline(String outline, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/outline-color
     */
    String getOutlineColor();

    Style setOutlineColor(String outlineColor);

    Style setOutlineColor(String outlineColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/outline-offset
     */
    String getOutlineOffset();

    Style setOutlineOffset(String outlineOffset);

    Style setOutlineOffset(String outlineOffset, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/outline-style
     */
    String getOutlineStyle();

    Style setOutlineStyle(String outlineStyle);

    Style setOutlineStyle(String outlineStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/outline-width
     */
    Object getOutlineWidth();

    Style setOutlineWidth(Object outlineWidth);

    Style setOutlineWidth(Object outlineWidth, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/overflow
     */
    String getOverflow();

    Style setOverflow(String overflow);

    Style setOverflow(String overflow, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/padding
     */
    Object getPadding();

    Style setPadding(Object padding);

    Style setPadding(Object padding, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/padding-bottom
     */
    Object getPaddingBottom();

    Style setPaddingBottom(Object paddingBottom);

    Style setPaddingBottom(Object paddingBottom, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/padding-left
     */
    Object getPaddingLeft();

    Style setPaddingLeft(Object paddingLeft);

    Style setPaddingLeft(Object paddingLeft, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/padding-right
     */
    Object getPaddingRight();

    Style setPaddingRight(Object paddingRight);

    Style setPaddingRight(Object paddingRight, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/padding-top
     */
    Object getPaddingTop();

    Style setPaddingTop(Object paddingTop);

    Style setPaddingTop(Object paddingTop, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/page
     */
    String getPage();

    Style setPage(String page);

    Style setPage(String page, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/page-break-after
     */
    String getPageBreakAfter();

    Style setPageBreakAfter(String pageBreakAfter);

    Style setPageBreakAfter(String pageBreakAfter, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/page-break-before
     */
    String getPageBreakBefore();

    Style setPageBreakBefore(String pageBreakBefore);

    Style setPageBreakBefore(String pageBreakBefore, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/page-break-inside
     */
    String getPageBreakInside();

    Style setPageBreakInside(String pageBreakInside);

    Style setPageBreakInside(String pageBreakInside, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/perspective
     */
    String getPerspective();

    Style setPerspective(String perspective);

    Style setPerspective(String perspective, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/perspective-origin
     */
    Object getPerspectiveOrigin();

    Style setPerspectiveOrigin(Object perspectiveOrigin);

    Style setPerspectiveOrigin(Object perspectiveOrigin, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/pointer-events
     */
    String getPointerEvents();

    Style setPointerEvents(String pointerEvents);

    Style setPointerEvents(String pointerEvents, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/position
     */
    String getPosition();

    Style setPosition(String position);

    Style setPosition(String position, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/quotes
     */
    String getQuotes();

    Style setQuotes(String quotes);

    Style setQuotes(String quotes, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/resize
     */
    String getResize();

    Style setResize(String resize);

    Style setResize(String resize, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/right
     */
    Object getRight();

    Style setRight(Object right);

    Style setRight(Object right, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/table-layout
     */
    String getTableLayout();

    Style setTableLayout(String tableLayout);

    Style setTableLayout(String tableLayout, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-align
     */
    String getTextAlign();

    Style setTextAlign(String textAlign);

    Style setTextAlign(String textAlign, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-decoration
     */
    String getTextDecoration();

    Style setTextDecoration(String textDecoration);

    Style setTextDecoration(String textDecoration, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
     */
    String getTextDecorationColor();

    Style setTextDecorationColor(String textDecorationColor);

    Style setTextDecorationColor(String textDecorationColor, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
     */
    String getTextDecorationLine();

    Style setTextDecorationLine(String textDecorationLine);

    Style setTextDecorationLine(String textDecorationLine, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
     */
    String getTextDecorationStyle();

    Style setTextDecorationStyle(String textDecorationStyle);

    Style setTextDecorationStyle(String textDecorationStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-indent
     */
    String getTextIndent();

    Style setTextIndent(String textIndent);

    Style setTextIndent(String textIndent, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-overflow
     */
    String getTextOverflow();

    Style setTextOverflow(String textOverflow);

    Style setTextOverflow(String textOverflow, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-shadow
     */
    String getTextShadow();

    Style setTextShadow(String textShadow);

    Style setTextShadow(String textShadow, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/text-transform
     */
    String getTextTransform();

    Style setTextTransform(String textTransform);

    Style setTextTransform(String textTransform, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/top
     */
    Object getTop();

    Style setTop(Object top);

    Style setTop(Object top, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transform
     */
    String getTransform();

    Style setTransform(String transform);

    Style setTransform(String transform, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transform-origin
     */
    Object getTransformOrigin();

    Style setTransformOrigin(Object transformOrigin);

    Style setTransformOrigin(Object transformOrigin, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transform-style
     */
    String getTransformStyle();

    Style setTransformStyle(String transformStyle);

    Style setTransformStyle(String transformStyle, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transition
     */
    String getTransition();

    Style setTransition(String transition);

    Style setTransition(String transition, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transition-delay
     */
    String getTransitionDelay();

    Style setTransitionDelay(String transitionDelay);

    Style setTransitionDelay(String transitionDelay, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transition-duration
     */
    String getTransitionDuration();

    Style setTransitionDuration(String transitionDuration);

    Style setTransitionDuration(String transitionDuration, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transition-property
     */
    String getTransitionProperty();

    Style setTransitionProperty(String transitionProperty);

    Style setTransitionProperty(String transitionProperty, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/transition-timing-function
     */
    String getTransitionTimingFunction();

    Style setTransitionTimingFunction(String transitionTimingFunction);

    Style setTransitionTimingFunction(String transitionTimingFunction, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
     */
    String getUnicodeBidi();

    Style setUnicodeBidi(String unicodeBidi);

    Style setUnicodeBidi(String unicodeBidi, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/user-select
     */
    String getUserSelect();

    Style setUserSelect(String userSelect);

    Style setUserSelect(String userSelect, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/vertical-align
     */
    String getVerticalAlign();

    Style setVerticalAlign(String verticalAlign);

    Style setVerticalAlign(String verticalAlign, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/visibility
     */
    String getVisibility();

    Style setVisibility(String visibility);

    Style setVisibility(String visibility, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/white-space
     */
    String getWhiteSpace();

    Style setWhiteSpace(String whiteSpace);

    Style setWhiteSpace(String whiteSpace, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/widows
     */
    String getWidows();

    Style setWidows(String widows);

    Style setWidows(String widows, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/width
     */
    Object getWidth();

    Style setWidth(Object width);

    Style setWidth(Object width, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/will-change
     */
    String getWillChange();

    Style setWillChange(String willChange);

    Style setWillChange(String willChange, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/word-spacing
     */
    String getWordSpacing();

    Style setWordSpacing(String wordSpacing);

    Style setWordSpacing(String wordSpacing, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
     */
    String getWordWrap();

    Style setWordWrap(String wordWrap);

    Style setWordWrap(String wordWrap, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/z-index
     */
    Object getZIndex();

    Style setZIndex(Object zIndex);

    Style setZIndex(Object zIndex, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/row-gap
     */
    Object getRowGap();

    Style setRowGap(Object rowGap);

    Style setRowGap(Object rowGap, boolean important);

    /**
     * https://developer.mozilla.org/docs/Web/CSS/column-gap
     */
    Object getColumnGap();

    Style setColumnGap(Object columnGap);

    Style setColumnGap(Object columnGap, boolean important);

    String getCssText();

    public static String parseProperty(Object value) {
        if (value == null)
            return "";

        if (value instanceof String)
            return ((String) (value));

        if (value instanceof Double)
            return ((Double) (value)).toString() + "px";

        if (value instanceof Integer)
            return ((Integer) (value)).toString() + "px";

        return null;
    }

    boolean hasProperties();

    Map<StyleProperty, StylePropertyValue> getProperties();

    void append(Style other);
}