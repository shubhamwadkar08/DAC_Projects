import userContext from "../context/userContext";
import Base from "../components/Base";
import "../pages/About.css";
const About = () => {
  return (
    <userContext.Consumer>
      {(object) => (
        <Base>
          <div className="about-us text-color ms-5 me-5 mr-5 mt-3">
            <h2>About The Blogminton Blog Site</h2>
            <p>
              Welcome to our premier badminton blog site, where we serve as your
              ultimate destination for everything related to the thrilling sport
              of badminton. Whether you're a seasoned player, an enthusiastic
              fan, or someone just discovering the beauty of shuttlecock and
              racquet, our blog is tailored to cater to your badminton cravings.
            </p>
            <p>
              At Blogminton, we are more than just a blog; we are a
              community of badminton aficionados who are passionate about
              sharing our knowledge, insights, and experiences. Our team
              consists of experienced players, coaches, and enthusiasts who are
              dedicated to bringing you the latest updates, expert advice, and
              engaging content about the world of badminton.
            </p>
            <p>
              Thank you for choosing The Blogminton. We look forward to serving
              you!
            </p>
          </div>
          {/* {console.log(object)}
          <h4>Welcome user: {object.user.login && object.user.data.name}</h4> */}
        </Base>
      )}
    </userContext.Consumer>
  );
};

export default About;
