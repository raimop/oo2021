public class GameCharacter {
  public int x;
  public int y;

  public String name;

  private Direction direction;

  private GameCharacterType gameCharacterType;

  public GameCharacter(String name, int x, int y, GameCharacterType gameCharacterType){
    this.name = name;
    this.gameCharacterType = gameCharacterType;
    this.direction = Direction.RIGHT;

    this.x = x;
    this.y = y;
  }

  public void setDirection(Direction d){
    this.direction = d;
    move();
  }

  public void move(){
    switch(this.direction){
      case UP:
        this.y--;
        break;
      case RIGHT:
        this.x++;
        break;
      case DOWN:
        this.y++;
        break;
      case LEFT:
        this.x--;
        break;
      default:
        break;
    }
  }

  @Override
  public String toString(){
    return "My name is " + name + " and x: " + x + " and y: " + y;
  }
}